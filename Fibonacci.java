import java.util.Scanner;
//Write a program to find the fibonacci series of given number.
/*
The Fibonacci series is a series of elements where, the previous two elements are added to get the next element by using for the for loop. A for loop is a repetition control structure which allows us to write a loop that is executed a specific number of times. The loop enables us to perform n number of steps together in one line. In for loop, a loop variable is used to control the loop.
 */
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=in.nextInt();//5
        int a=-1,b=1,c;
        for(int i=1;i<=n;i++)//1<=5 2<=5 3<=5 4<=5  5<=5  6<=5
        {
            c=a+b;//-1+1=>0  1+0=>1  0+1=1  1+1=2  1+2=3
            System.out.println(c); //0  1  1 2  3
            a=b;//1 0  1  1  2
            b=c;//0 1  1  2  3
        }
    }
}