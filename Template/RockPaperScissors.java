package Template;

import java.util.Random;

public class RockPaperScissors extends Game {
    private int[] scores;
    private int rounds;
    private int maxRounds;
    private Random random;

    @Override
    public void initializeGame(int numberOfPlayers) {
        scores = new int[numberOfPlayers];
        rounds = 0;
        maxRounds = 3; // Play 3 rounds
        random = new Random();
        System.out.println("RockPaperScissors initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        return rounds >= maxRounds;
    }

    @Override
    public void playSingleTurn(int player) {
        int move1 = random.nextInt(3); // 0 = Rock, 1 = Paper, 2 = Scissors
        int move2 = random.nextInt(3); // 0 = Rock, 1 = Paper, 2 = Scissors
        System.out.println("Player 0 plays " + moveToString(move1));
        System.out.println("Player 1 plays " + moveToString(move2));

        int result = determineWinner(move1, move2);
        if (result == 1) {
            scores[0]++;
            System.out.println("Player 0 wins this round.");
        } else if (result == 2) {
            scores[1]++;
            System.out.println("Player 1 wins this round.");
        } else {
            System.out.println("This round is a tie.");
        }
        rounds++;
    }

    @Override
    public void displayWinner() {
        if (scores[0] > scores[1]) {
            System.out.println("Player 0 wins with score " + scores[0]);
        } else if (scores[1] > scores[0]) {
            System.out.println("Player 1 wins with score " + scores[1]);
        } else {
            System.out.println("The game is a tie.");
        }
    }

    private String moveToString(int move) {
        switch (move) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "Unknown";
        }
    }

    private int determineWinner(int move1, int move2) {
        if (move1 == move2) return 0; // Tie
        switch (move1) {
            case 0: return (move2 == 2) ? 1 : 2; // Rock beats Scissors
            case 1: return (move2 == 0) ? 1 : 2; // Paper beats Rock
            case 2: return (move2 == 1) ? 1 : 2; // Scissors beats Paper
            default: return 0;
        }
    }
}