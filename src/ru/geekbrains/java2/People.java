package ru.geekbrains.java2;

public class People implements Member {

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void jump() {
        System.out.println("Jumping");
    }

}
