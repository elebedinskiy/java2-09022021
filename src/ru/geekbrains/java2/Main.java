package ru.geekbrains.java2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Member[] members = {
            new People("Ivan", 5000,2),
            new Cat("Barsik",100, 1.8f),
            new Robot("r2d2",10000,3)
        };

        Obstacle[] obstacles = {
            new Track(150f),
            new Wall(1.5f),
            new Track(10000f),
            new Wall(2.5f),
            new Track(5000f)
        };

        overcomeObstacles(members, obstacles);

    }

    static void overcomeObstacles (Member[] members, Obstacle[] obstacles){

        boolean[] log = new boolean[members.length];
        Arrays.fill(log, true);

        for (int i = 0; i < obstacles.length; i++){

            System.out.println(">>> Obstacle #" + (i + 1) + " <<<");

            for (int j = 0; j < members.length; j++) {

                if (obstacles[i] instanceof Track && log[j]) {
                    if(!members[j].run(obstacles[i])) log[j] = false;
                }
                else if (obstacles[i] instanceof Wall && log[j]) {
                    if(!members[j].jump(obstacles[i])) log[j] = false;
                }
            }
            System.out.println();
        }

        System.out.println("!!! Winners !!!");
        for (int i = 0; i < log.length; i++){
            if (log[i]) System.out.println("member #" + (i + 1)+ ", name: " + members[i].getName());
        }
    }

}