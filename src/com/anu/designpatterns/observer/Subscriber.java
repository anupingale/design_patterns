package com.anu.designpatterns.observer;

public class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(String notification) {
        System.out.println(String.format("%s recieved notification : %s", name, notification));
    }
}
