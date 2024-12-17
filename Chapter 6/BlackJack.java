import java.util.Random;

public class BlackJack {
    private int score;

    public BlackJack() {
        score = 0;
    }

    public void addScore() {
        Random random = new Random();
        score += random.nextInt(1, 6);
    }

    public int getScore() {
        return score;
    }
}
