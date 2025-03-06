import java.util.ArrayList;

public class DriversLicense {
    int totalIncorrect;
    String[] answerKey;
    String[] studentTest;

    public DriversLicense(String[] studentTest) {
        answerKey = new String[] {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", 
                                "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};

        this.studentTest = studentTest;
    }

    public boolean passed() {
        return totalIncorrect <= 5;
    }

    public int totalCorrect() {
        return 20 - totalIncorrect;
    }

    public int totalIncorrect() {
        return totalIncorrect;
    }

    public void incorrect(){
        for(int i = 0; i < 20; i++) {
            if(!studentTest[i].equals(answerKey[i])) {
                totalIncorrect++;
            }
        }
    }

    public ArrayList<Integer> questionsMissed(){
        ArrayList<Integer> missed = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            if(!studentTest[i].equals(answerKey[i])) {
                missed.add(i + 1);
                totalIncorrect++;
            }
        }
        return missed;
    }
}
