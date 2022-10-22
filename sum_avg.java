import java.util.Scanner;
//Write a program to find the sum and average of given n numbers.
/*
The average is the outcome from the sum of the numbers divided by the count of the numbers being averaged by using for the for loop. A for loop is a repetition control structure which allows us to write a loop that is executed a specific number of times. The loop enables us to perform n number of steps together in one line. In for loop, a loop variable is used to control the loop.
  Example:
    10,20,30,40,50.
    Sum of given numbers = 150.
    Average of given numbers = 30.
 */
public class sum_avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Limit: ");
        int n=in.nextInt();
        int sum=0,a;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter The Number "+i+": ");
            a=in.nextInt();
            sum+=a;//sum=sum+a;
        }
        System.out.println("The sum of given numbers is : "+sum);
        System.out.println("The Average of given numbers is : "+sum/n);
    }
}