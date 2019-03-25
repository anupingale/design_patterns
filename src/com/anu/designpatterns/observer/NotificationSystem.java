package com.anu.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem extends Observable {

    private List<Video> videos;

    NotificationSystem() {
        this.videos = new ArrayList<>();
    }

    void addVideo(Video video) {
        this.videos.add(video);
        this.notify(String.format("%s got added in playlist", video.name));
    }

    public void removeVideo(Video video) {
        this.videos.remove(video);
        this.notify(String.format("%s got removed from playlist",video.name));
    }
}
