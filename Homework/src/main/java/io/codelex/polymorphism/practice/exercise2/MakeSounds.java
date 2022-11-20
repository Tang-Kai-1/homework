package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;

public class MakeSounds {
    public static void main(String[] arg) {
        Parrot sound1 = new Parrot();
        Radio sound2 = new Radio();
        Firework sound3 = new Firework();
        ArrayList<Sound> list = new ArrayList<>();
        list.add(sound1);
        list.add(sound2);
        list.add(sound3);
        for (int i = 0; i < 60; i++) {
            for (Sound sound : list) {
                sound.playSound();
            }
        }
    }
}
