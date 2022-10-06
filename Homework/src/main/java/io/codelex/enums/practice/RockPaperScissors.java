package io.codelex.enums.practice;

public enum RockPaperScissors {
    ROCK("r", 1),
    PAPER("p", 2),
    SCISSORS("s", 3);
    private final String choice;
    private final int worth;

    RockPaperScissors(String choice, int worth) {
        this.choice = choice;
        this.worth = worth;
    }

    public static RockPaperScissors getEnum(String input) {
        for (RockPaperScissors move : RockPaperScissors.values()) {
            if (move.choice.equals(input)) {
                return move;
            }
        }
        return ROCK;
    }

    public static RockPaperScissors getComputerEnum(int choice) {
        if (choice == 1) {
            return ROCK;
        } else if (choice == 2) {
            return PAPER;
        } else {
            return SCISSORS;
        }
    }

    public static double[] getWinner(RockPaperScissors player, RockPaperScissors computer, double[] gameState) {
        double playerWins = gameState[0];
        double computerWins = gameState[1];
        double plays = gameState[2];
        if (player == computer) {
            System.out.println("Tie");
        } else if ((player == ROCK && computer == SCISSORS) || (player == PAPER && computer == ROCK) || (player == SCISSORS && computer == PAPER)) {
            System.out.println("Player wins");
            playerWins++;
        } else {
            System.out.println("Computer wins");
            computerWins++;
        }
        plays++;
        return new double[]{playerWins, computerWins, plays};
    }
}
