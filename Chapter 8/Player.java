import java.util.Random;

public class Player {
    public int score;

    public Player() {
        score = 50;
    }

    public int getScore() {
        return score;
    }
 
    public void roll() {
        Random random = new Random();
        int roll = random.nextInt(1,7);
        System.out.println("You rolled a " + roll);

        if((score - roll) <= 0) {
            score += roll;
        } else {
            score -= roll;
        }
        
        
    }
}
