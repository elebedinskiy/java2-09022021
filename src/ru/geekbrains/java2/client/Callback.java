package ru.geekbrains.java2.client;

@FunctionalInterface
public interface Callback {
    void callback(Object... args);
}