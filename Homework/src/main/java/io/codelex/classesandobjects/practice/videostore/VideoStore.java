package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> videoInventory = new ArrayList<>();

    public void videoStoreAdd(String title, double rating) {
        videoInventory.add(new Video(title, rating));
    }

    public void videoCheckOut(String title) {
        for (Video video : videoInventory) {
            if (video.getTitle().equals(title)) {
                video.setCheckedOut();
                break;
            }
        }
    }

    public void videoCheckIn(String title, double rating) {
        for (Video video : videoInventory) {
            if (video.getTitle().equals(title)) {
                if (video.isCheckedOut()) {
                    video.addRating(rating);
                }
                video.setCheckedIn();
                break;
            }
        }
    }
    /*
    public void videoRating(String title, double rating) {
        for (Video video : videoInventory) {
            if (video.getTitle().equals(title)) {
                video.addRating(rating);
                break;
            }
        }
    }
    // Decided not to use this method, but it can be added to video store as a separate action.
     */

    public void printVideoInventory() {
        for (Video video : videoInventory) {
            video.printVideo();
        }
    }

}
