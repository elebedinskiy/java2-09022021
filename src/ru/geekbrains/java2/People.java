package ru.geekbrains.java2;

public class People implements Member {

    private String name;
    private float maxRunDistance;
    private float maxJumpDistance;

    People(String name, float maxRunDistance, float maxJumpDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean run(Obstacle obstacle) {
        if (obstacle.getMainParam() <= maxRunDistance) {
            System.out.println("People running");
            return true;
        } else {
            System.out.println("People did not running");
            return false;
        }
    }

    @Override
    public boolean jump(Obstacle obstacle) {
        if (obstacle.getMainParam() <= maxJumpDistance) {
            System.out.println("People jumping");
            return true;
        } else {
            System.out.println("People did not jumping");
            return false;
        }
    }
}