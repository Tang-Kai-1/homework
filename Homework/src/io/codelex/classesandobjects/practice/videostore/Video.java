package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut = false;
    private double rating;
    private int userCount = 1;

    protected Video(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    protected String getTitle() {
        return title;
    }

    protected boolean isCheckedOut() {
        return checkedOut;
    }

    protected void setCheckedOut() {
        if (isCheckedOut()) {
            System.out.println("Already checked out.");
        } else {
            this.checkedOut = true;
            userCount += 1;
            System.out.println("Video checked out.");
        }
    }

    protected void setCheckedIn() {
        if (!isCheckedOut()) {
            System.out.println("Already checked in.");
        } else {
            this.checkedOut = false;
            System.out.println("Video checked back in.");
        }
    }

    protected double getRating() {
        return rating / userCount;
    }

    protected void addRating(double rating) {
        this.rating += rating;
    }

    protected void printVideo() {
        System.out.println("title: " + this.title + "; rating: " + getRating() + "; Is checked out: " + this.checkedOut);
    }
}
