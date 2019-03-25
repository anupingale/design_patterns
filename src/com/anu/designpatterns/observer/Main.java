package com.anu.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();

        Video video1 = new Video("video1");
        Video video2 = new Video("video2");
        Video video3 = new Video("video3");

        Subscriber observer1 = new Subscriber("subscriber-1");
        Subscriber observer2 = new Subscriber("subscriber-2");

        notificationSystem.addObserver(observer1);
        notificationSystem.addObserver(observer2);
        notificationSystem.addVideo(video1);
        notificationSystem.addVideo(video2);
        notificationSystem.addVideo(video3);
        notificationSystem.removeVideo(video3);
        notificationSystem.removeObserver(observer1);
    }
}
