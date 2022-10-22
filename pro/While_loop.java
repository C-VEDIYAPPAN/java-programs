import java.util.Scanner;
public class While_loop {
    public static void main(String[] args) {
        /*
        Syntax:
   while(Condition)
   {
       // body of loop;
       // Increment (or) Decrement;
   }
         */
        System.out.println("Enter The Limit : ");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
