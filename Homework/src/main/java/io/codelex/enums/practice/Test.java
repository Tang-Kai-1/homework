package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CardinalPoints.printEnums();
        playGame();
    }

    public static void playGame() throws InterruptedException {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String play = "y";
        double[] gameState = {0, 0, 0};
        while (play.equals("y")) {
            System.out.println("Enter your move[r/p/s]:");
            String player = sc.nextLine().toLowerCase();
            RockPaperScissors playerMove = RockPaperScissors.getEnum(player);
            int computerChoice = random.nextInt(1, 3);
            RockPaperScissors computerMove = RockPaperScissors.getComputerEnum(computerChoice);
            Thread.sleep(1000);
            System.out.println("Computer move: " + computerMove);
            gameState = RockPaperScissors.getWinner(playerMove, computerMove, gameState);
            System.out.println("Do you want to play again?[Y/N]");
            play = sc.nextLine();
        }
        double gameCount = gameState[2];
        double playerWinRate = (gameState[0] / gameCount) * 100;
        double computerWinRate = (gameState[1] / gameCount) * 100;
        System.out.println("Game ended.");
        System.out.println("Number of plays: " + String.format("%.0f", gameCount));
        System.out.println("Player win rate: " + String.format("%.2f", playerWinRate) + "% ; Computer win rate: " + String.format("%.2f", computerWinRate) + "%");
    }
}
