//always start with importing our scanner so we can use it!
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {

        //receiving and printing the user's age back to them
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        String age = sc.nextLine();
        System.out.println("You are " + age + " years old.");
            

        //take these variables and print out the sum of them
        int num1 = 10;
        int num2 = 37;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + ".");
        //I learned how to use the scanner to take input from the user. I am so used to the easier way with Python. 
        //I also learned how to put strings together with variables in print statements.
        //I learned the difference between System.out.print and System.out.println. 
 }
}
