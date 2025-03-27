import java.util.Scanner;
public class QuestionTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            Question[] array = new Question[10];

            Question bird = new Question();
            bird.setQuestion("Which is the fastest bird on foot? ");
            bird.setAnswer1("Ostrich");
            bird.setAnswer2("Sparrow");
            bird.setAnswer3("Eagle");
            bird.setAnswer4("Woodpecker");
            bird.setCorrectAnswer(1);
            array[0] = bird;

            Question planet = new Question();
            planet.setQuestion("Which planet is closest to the sun? ");
            planet.setAnswer1("Venus");
            planet.setAnswer2("Earth");
            planet.setAnswer3("Mercury");
            planet.setAnswer4("Saturn");
            planet.setCorrectAnswer(3);
            array[1] = planet;

            Question heptagon = new Question();
            heptagon.setQuestion("How many sides does a heptagon have? ");
            heptagon.setAnswer1("4");
            heptagon.setAnswer2("6");
            heptagon.setAnswer3("7");
            heptagon.setAnswer4("8");
            heptagon.setCorrectAnswer(3);
            array[2] = heptagon;

            Question member = new Question();
            member.setQuestion("How many years is one regular term for a member of the house of representatives in the U.S? ");
            member.setAnswer1("3");
            member.setAnswer2("1");
            member.setAnswer3("2");
            member.setAnswer4("6");
            member.setCorrectAnswer(3);
            array[3] = member;

            Question gulf = new Question();
            gulf.setQuestion("Which of the following states doesn't share a border with the gulf of Mexico? ");
            gulf.setAnswer1("Georgia");
            gulf.setAnswer2("Texas");
            gulf.setAnswer3("Florida");
            gulf.setAnswer4("Alabama");
            gulf.setCorrectAnswer(1);
            array[4] = gulf;

            Question prime = new Question();
            prime.setQuestion("What is the smallest prime number? ");
            prime.setAnswer1("0");
            prime.setAnswer2("1");
            prime.setAnswer3("2");
            prime.setAnswer4("3");
            prime.setCorrectAnswer(3);
            array[5] = prime;

            Question country = new Question();
            country.setQuestion("What is the largest South American country by area? ");
            country.setAnswer1("Argentina");
            country.setAnswer2("Brazil");
            country.setAnswer3("Chile");
            country.setAnswer4("Mexico");
            country.setCorrectAnswer(2);
            array[6] = country;

            Question corner = new Question();
            corner.setQuestion("Which one of the following states is not part of the four corners? ");
            corner.setAnswer1("New Mexico");
            corner.setAnswer2("Utah");
            corner.setAnswer3("Colorado");
            corner.setAnswer4("Nevada");
            corner.setCorrectAnswer(4);
            array[7] = corner;

            Question moon = new Question();
            moon.setQuestion("Who was the first person to step on the moon? ");
            moon.setAnswer1("Neil Armstrong");
            moon.setAnswer2(" Edwin Buzz Aldrin");
            moon.setAnswer3("John Glenn");
            moon.setAnswer4("Cole Nola");
            moon.setCorrectAnswer(1);
            array[8] = moon;

            Question adverb = new Question();
            adverb.setQuestion("'Carefully' is an example of what type of word? ");
            adverb.setAnswer1("Adjective");
            adverb.setAnswer2("Noun");
            adverb.setAnswer3("Verb");
            adverb.setAnswer4("Adverb");
            adverb.setCorrectAnswer(4);
            array[9] = adverb;

            int player1 = 0;
            int player2 = 0;
            boolean turn;
            for(int i = 0; i < 10; i++) {
                if(i % 2 == 0) {
                    System.out.println("Player 1: ");
                    turn = true;
                } else {
                    System.out.println("Player 2");
                    turn = false;
                }

                System.out.println("Question " + (i+1) + ": " + array[i].getQuestion());
                System.out.println("Answer 1: " + array[i].getAnswer1());
                System.out.println("Answer 2: " + array[i].getAnswer2());
                System.out.println("Answer 3: " + array[i].getAnswer3());
                System.out.println("Answer 4: " + array[i].getAnswer4());

                System.out.println("Your answer: ");
                int answer;
                while(true) {
                    answer = input.nextInt();
                    if(answer == 1 || answer == 2 || answer == 3 || answer == 4) {
                        break;
                    } 
                    System.out.println("Invalid answer, try again. Answer 1,2,3, or 4. ");
                }

                if(answer == array[i].getCorrectAnswer()) {
                    if(turn) {
                        player1++;
                    } else { 
                        player2++;
                    }
                }
                System.out.println();
            }

            System.out.println("Player one answered " + player1 + " correctly. ");
            System.out.println("Player two answered " + player2 + " correctly. ");
            if(player1 == player2) {
                System.out.println("It was a tie. ");
            } else if( player1 > player2) {
                System.out.println("Player one won. ");
            } else{ 
                System.out.println("Player two won. ");
            }


            input.nextLine();
            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
