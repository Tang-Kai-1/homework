package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    private static Scanner sc = new Scanner(System.in);
    private static String word;
    private static String wordChangable;
    private static String misses;
    private static String guessWord;

    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        String gameState = "again";
        while (!gameState.equals("quit")) {
            word = chooseRandWord();
            wordChangable = word;
            misses = "";
            guessWord = "_ ".repeat(word.length());
            while (!guessWord.replaceAll("[^a-z]", "").equals(word)) {
                printGame(guessWord, misses);
                System.out.print("Guess:  ");
                String guess = sc.nextLine().replaceAll("[^a-z]", "");
                if (guess.length() != 1) {
                    System.out.println("Incorrect input. Try again.");
                } else {
                    wordCheck(guess);
                }
                if (misses.length() == 4) break;
            }
            printGame(guessWord, misses);
            gameEnd();
            gameState = playAgain();
        }
    }

    private static void wordCheck(String guess) {
        int guessLetterIndex = wordChangable.indexOf(guess.charAt(0));
        if (guessLetterIndex == -1) {
            misses += guess;
        } else {
            if (guessLetterIndex == 0) {
                guessWord = guess + guessWord.substring(1);
                wordChangable = "-" + wordChangable.substring(1);
            } else if (guessLetterIndex == wordChangable.length() - 1) {
                guessWord = guessWord.substring(0, guessLetterIndex * 2) + guess;
                wordChangable = wordChangable.substring(0, guessLetterIndex) + "-";
            } else {
                guessWord = guessWord.substring(0, guessLetterIndex * 2) + guess + guessWord.substring((guessLetterIndex * 2) + 1);
                wordChangable = wordChangable.substring(0, guessLetterIndex) + "-" + wordChangable.substring(guessLetterIndex + 1);
            }
        }
    }

    private static String playAgain() {
        while (true) {
            System.out.print("Play \"again\" or \"quit\"? ");
            String choice = sc.nextLine();
            if (choice.equals("again") || choice.equals("quit")) {
                return choice;
            } else {
                System.out.println("Incorrect input! Try again.");
            }
        }
    }

    private static void gameEnd() {
        if (guessWord.replaceAll("[^a-z]", "").equals(word) && misses.length() < 4) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("YOU FAILED.");
        }
    }

    private static void printGame(String wordDashes, String missedLetters) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("Word:  " + wordDashes);
        System.out.println();
        System.out.println("Misses:  " + missedLetters);
        System.out.println();
    }

    private static String chooseRandWord() {
        String[] words = {"tease", "pay", "thoughtful", "calm", "decorative", "sea", "discount", "council", "collection", "root"};
        Random rand = new Random();
        int index = rand.nextInt(words.length - 0) + 0;
        return words[index];
    }
}
