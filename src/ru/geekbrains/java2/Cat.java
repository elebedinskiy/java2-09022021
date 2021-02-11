package ru.geekbrains.java2;

public class Cat implements Member {

    private String name;
    private float maxRunDistance;
    private float maxJumpDistance;

    Cat(String name, float maxRunDistance, float maxJumpDistance){
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
            System.out.println("Cat running");
            return true;
        } else {
            System.out.println("Cat did not running");
            return false;
        }
    }

    @Override
    public boolean jump(Obstacle obstacle) {
        if (obstacle.getMainParam() <= maxJumpDistance) {
            System.out.println("Cat jumping");
            return true;
        } else {
            System.out.println("Cat did not jumping");
            return false;
        }
    }

}
