package ru.geekbrains.java2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Thread inputMessageFronNetwork = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = null;
                        try {
                            str = in.readUTF();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (str.equals("/end")) {
                            break;
                        }
                        try {
                            out.writeUTF("Эхо: " + str);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            inputMessageFronNetwork.start();

            Thread inputMessageOnServer = new Thread(new Runnable() {
                @Override
                public void run() {
                    Scanner scanner = new Scanner(System.in);
                    String str = null;
                    while (true){
                        str = scanner.nextLine();
                        try {
                            out.writeUTF("Srv: " + str);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Srv: " + str);
                    }
                }
            });
            inputMessageOnServer.start();

            inputMessageFronNetwork.join();
            inputMessageOnServer.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}