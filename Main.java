import java.util.Scanner;
/**
 * This program computes the grade for a 5 questions multiple choice test
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // declare a constant 
    final int FIVE_QUESTIONS = 5;

    // create an array with 5 spots for the 5 solution to the test
    String[] answersCorrect = new String[FIVE_QUESTIONS];

    // ask the user to enter the answers to the test
    System.out.println("Please enter the answers to the test:");

    // put the 5 answers from user's value into the array using a for loop
    for(int i = 0; i < FIVE_QUESTIONS; i++){

      // putting the user's values into the array
      answersCorrect [i] = input.nextLine();
    }

    // create a second array with 5 spots for 5 answers of the test
    String[] answersOfStudent = new String[FIVE_QUESTIONS];

    //ask the user to enter the student answers
    System.out.println("Please enter the student answers:");

    // put the 5 answers from user's value into the array using a for loop
    for(int i = 0; i < FIVE_QUESTIONS; i++){

      // putting the user's values into the array
      answersOfStudent [i] = input.nextLine();
    }

    // create a variable for the sum
    int sum = 0;

    // use a for loop to determine how many answers are correct
    for(int i = 0; i < FIVE_QUESTIONS; i++){
      
      // use an if statement to check wether the answers match
      if(answersCorrect[i].equals(answersOfStudent[i])){
        
        // calculate the sum of correct answers 
        sum = sum + 1;

      }
    }
    // print out the score of the student
    System.out.println("Score: " + sum);
  }
}
