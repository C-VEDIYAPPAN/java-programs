import java.util.Scanner;
public class Reverse_Number {
    /*
    A number can be written in reverse order using for the while loop. While loop is also known as a pre-tested loop. In general, a while loop allows a part of the code to be executed multiple times depending upon a given boolean condition. It can be viewed as a repeating if statement. The while loop is mostly used in the case where the number of iterations is not known in advance.

First,the remainder of the num divided by 10 is stored in the variable digit .The digit contains the last digit of num , example 5. digit is then added to the variable reversed after multiplying it by 10. Multiplication by 10 adds a new place in the reversed number.
     */
    //Write a program to find the reverse of N digit Number
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = in.nextInt();
        int reverse=0, rem;
        while(n!=0)
        {
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        System.out.println("Reversed Number: "+reverse);
    }
}

