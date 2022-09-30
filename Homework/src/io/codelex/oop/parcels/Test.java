package io.codelex.oop.parcels;

public class Test {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(25, 35, 40, 15, true);
        Parcel parcel2 = new Parcel(30, 25, 40, 15, true);
        Parcel parcel3 = new Parcel(30, 35, 28, 15, true);
        Parcel parcel4 = new Parcel(30, 35, 40, 31, false);
        Parcel parcel5 = new Parcel(30, 35, 40, 16, true);
        Parcel parcel6 = new Parcel(30, 35, 40, 14, true);
        System.out.println(parcel1.validate());
        System.out.println(parcel2.validate());
        System.out.println(parcel3.validate());
        System.out.println(parcel4.validate());
        System.out.println(parcel5.validate());
        System.out.println(parcel6.validate());
    }
}
