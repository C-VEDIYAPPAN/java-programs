import java.util.Scanner;

public class factor {
    //Write a program to find the factor of the given number.
    /*
      limit = 5
    5 1 => 5%1 = 0
    5 2 => 5%2 = 0
    5 3 => 5%3 = 1
    5 4 => 5%4 = 2
    5 5 => 5%5 = 0
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}