import java.util.Random;

public class Coin {
    String sideUp;

    public Coin() {
        Random random = new Random();

        if(random.nextInt(0,2) == 1) {
            sideUp = "heads";
        } else { 
            sideUp = "tails";
        }
    }

    public void toss() {
        Random random = new Random();

        if(random.nextInt(0,2) == 1) {
            sideUp = "heads";
        } else { 
            sideUp = "tails";
        }
    }

    public String getSideUp(){
        return sideUp;
    }
}
