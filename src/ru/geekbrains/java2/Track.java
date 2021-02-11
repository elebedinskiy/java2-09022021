package ru.geekbrains.java2;

public class Track implements Obstacle {

    private float length;

    Track(float length){
        this.length = length;
    }

    @Override
    public float getMainParam() {
        return length;
    }

}
