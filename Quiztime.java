import java.util.Scanner;
public class Quiztime{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] question={"What is the main function of the router?",
                           "Which part of computer is considered as brain?",
                           "Which year facebook launched?",
                           "Who is known as Father of computer?",
                           "Which is the first programming language?"};
        String options[][] = {{"1.Storing","2.Encrypted data","3.Directing internet traffic","4.Managing passwords"},
                              {"1.GPU","2.CPU","3.RAM","4.Hard drive"},
                              {"1.2000","2.2004","3.2006","4.2008"},
                              {"1. Charles babbage","2.steves john","3.Alan Mathew","4.Shahid kapoor"},
                              {"1.Fortran","2.Java","3.C","4.Python"}};
        int[] answers = {3,2,2,1,1};
        int score = 0;
        int guess;
        System.out.println("******************************");
        System.out.println("Welcome to the java quiz game!");
        System.out.println("******************************");
        for(int i = 0; i < question.length;i++){
            System.out.println(question[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter the guess: ");
            guess = sc.nextInt();
            if (guess == answers[i]){
                System.out.println();
                System.out.println("Congrats!You got it correct!");
                System.out.println();
                score++;
            }
            else{
                System.out.println();
                System.out.println("Oops that's wrong!Better luck next time");
                System.out.println();
            }
        }
        System.out.printf("Your score is %d out of 5",score);
        sc.close();
    }
}