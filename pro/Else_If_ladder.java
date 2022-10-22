import java.util.Scanner;
public class Else_If_ladder {
    public static void main(String[] args) {
        /*
        Syntax :
   if ( condition 1 )
   {
       // block of statement to be executed if condition is true ;
   }
   else if ( condition 2 )
   {
       // block of statement to be executed if the condition1 is false condition2 is true ;
   }
   else
   {
       block of statement to be executed if the condition1 is false condition2 is False ;
   }
         */
        float avg;
        System.out.println("Enter The Average Mark : ");
        Scanner in = new Scanner(System.in);
        avg = in.nextFloat();
        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade A");
        } else if (avg >= 80 && avg <= 89) {
            System.out.println("Grade B");
        } else if (avg >= 70 && avg <= 79) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
