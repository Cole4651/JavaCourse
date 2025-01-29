import java.util.Random;

public class Dice {
    private int score;
    
    public Dice() {
        score = 0;
    }

    public void rollDice() {
        Random random = new Random();
        score = random.nextInt(1, 6);
    }

    public int getScore() {
        return score;
    }
}
