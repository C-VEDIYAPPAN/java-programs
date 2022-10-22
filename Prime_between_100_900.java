import java.util.Scanner;
public class Prime_between_100_900 {
    /*
    A prime number is a whole number greater than 1. It has exactly two factors, that is, 1 and the number itself. Using for the for loop and if condition statement. A for loop is a repetition control structure which allows us to write a loop that is executed a specific number of times. The loop enables us to perform n number of steps together in one line. The if statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true. The if statement is written with the if keyword.
     */
    //Write a program to print the prime numbers between 1 to 999
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = 0;
        for(int n=1;n<=999;n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                System.out.println(n + " is a Prime Number");
            }
            f=0;
        }

    }
}