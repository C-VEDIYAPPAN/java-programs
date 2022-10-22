import java.util.Scanner;
public class Do_While_loop {
    public static void main(String[] args) {
        /*
        Syntax:
   do
   {
        // body of loop;
        // Increment (or) Decrement;
   }  while(Condition) ;
         */
            System.out.println("Enter The Limit : ");
            Scanner in =new Scanner(System.in);
            int n=in.nextInt();
            int i=2;
            do {
                System.out.println(i);
                i=i+2;
            }while (i<=n);
    }
}
