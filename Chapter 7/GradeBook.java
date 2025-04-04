public class GradeBook {
    String[] names;
    char[] letterGrades;
    double testScores[][];

    public GradeBook(){
        names = new String[5];
        letterGrades = new char[5];
        testScores = new double[5][4];
    }


    public double average(int index) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(testScores[index][i] > testScores[index][j]) {
                    double temp = testScores[index][j];
                    testScores[index][j] = testScores[index][i];
                    testScores[index][i] = temp;
                }
            }
        }

        double total = 0;
        for(int i = 0; i < 3; i++) {
            total += testScores[index][i];
        }

        total *= 100;
        return Math.round(total / 3.0) / 100.0;
    }

    public void setLetterGrade(double average, int studentIndex) {
        if(average < 60) {
            letterGrades[studentIndex] = 'F';
        } else if(average < 70) {
            letterGrades[studentIndex] = 'D';
        } else if(average < 80) {
            letterGrades[studentIndex] = 'C';
        } else if(average < 90) {
            letterGrades[studentIndex] = 'B';
        } else {
            letterGrades[studentIndex] = 'A';
        }
    }

    public char getLetterGrade(int index) {
        return letterGrades[index];
    }

    public void setScore(double score, int studentIndex, int testIndex) {
        testScores[studentIndex][testIndex] = score;
    }

    public void setName(String name, int index) {
        names[index] = name;
    }

    public String getName(int index) { 
        return names[index];
    }
}
