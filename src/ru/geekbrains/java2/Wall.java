package ru.geekbrains.java2;

public class Wall implements Obstacle {

    private float height;

    Wall(float height){
        this.height = height;
    }

    @Override
    public float getMainParam() {
        return height;
    }

}
