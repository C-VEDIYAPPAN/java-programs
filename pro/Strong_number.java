import java.util.Scanner;

public class Strong_number {
    //Write a program to check the given number is Strong number or not.
    /*
    Example : 1
    234
      = 2! + 3! + 4!
      = 2 + 6 + 24
      = 32
     So , 234 is not a strong number.
Example : 2
    145
      = 1! + 4! + 5!
      = 1 + 24 + 120
      = 145
     So , 145 is not a strong number.
     */
    public static void main(String args[])
    {
        int num,originalNum,rem,fact,i,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=in.nextInt();
        originalNum=num;
        while (num>0)//145>0  14>0 1>0
        {
            rem=num%10;
            //System.out.println("Reminder : "+rem);
            fact=1;
            for(i=1;i<=rem;i++){
                fact*=i;//fact=fact*i
            }
            //System.out.println("fact : "+fact);
            sum+=fact;
            num=num/10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is not a STRONG NUMBER");
        }
    }
}
