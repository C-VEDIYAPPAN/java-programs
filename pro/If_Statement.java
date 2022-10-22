import java.util.Scanner;
public class If_Statement {
    public static void main(String[] args) {
        /*
        The if statement is Java's conditional branch statement. It can be used to route program execution through two different paths. The if statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true. The if statement is written with the if keyword, followed by a condition in parentheses, with the code to be executed in between curly brackets.
  Syntax:
     if( condition )
     {
        // body of the statements;
     }
         */
        int age;
        System.out.println("Enter Your Age : ");
        Scanner in = new Scanner(System.in);
        age=in.nextInt();
        if(age>=18)
        {
            System.out.println("You are Eligible For Vote...");
        }
    }
}
