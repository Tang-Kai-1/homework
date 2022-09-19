package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        String gameState = "again";
        while (!gameState.equals("quit")) {
            String word = chooseRandWord();
            String wordChangable = new String(word);
            String misses = "";
            String guessWord = "_ ".repeat(word.length());
            //System.out.println(word);
            //System.out.println(guessWord);
            int guessCount = 0;
            while (!guessWord.replaceAll("[^a-z]", "").equals(word)) {
                printGame(guessWord, misses);
                System.out.print("Guess:  ");
                String guess = sc.nextLine().replaceAll("[^a-z]", "");
                if (guess.length() != 1) {
                    System.out.println("Incorrect input. Try again.");
                } else {
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
                    guessCount++;
                }
                if (guessCount == word.length() + 4) break;
            }
            printGame(guessWord, misses);
            if (guessWord.replaceAll("[^a-z]", "").equals(word) && guessCount < word.length() + 4) {
                System.out.println("YOU GOT IT!");
            } else {
                System.out.println("YOU FAILED.");
            }
            while (true) {
                System.out.print("Play \"again\" or \"quit\"? ");
                String choice = sc.nextLine();
                //System.out.println();
                //System.out.println(choice);
                if (choice.equals("again") || choice.equals("quit")) {
                    gameState = choice;
                    break;
                } else {
                    System.out.println("Incorrect input! Try again.");
                }
            }
        }
    }

    public static void printGame(String wordDashes, String missedLetters) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("Word:  " + wordDashes);
        System.out.println();
        System.out.println("Misses:  " + missedLetters);
        System.out.println();
    }

    public static String chooseRandWord() {
        String[] words = {"tease", "pay", "thoughtful", "calm", "decorative", "sea", "discount", "council", "collection", "root"};
        Random rand = new Random();
        int index = rand.nextInt(words.length - 0) + 0;
        return words[index];
    }
}
