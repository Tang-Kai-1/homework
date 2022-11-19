package io.codelex.classesandobjects.practice;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int month, int day, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2022);
        Date date2 = new Date(4, 26, -2022);
        Date date3 = new Date(9, 11, 1922);
        date1.displayDate();
        date2.displayDate();
        date3.displayDate();
        System.out.println();
        date2.setYear(1877);
        date2.displayDate();
    }
}
