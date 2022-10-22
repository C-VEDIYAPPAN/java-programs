import java.util.Scanner;
public class For_loop {
    public static void main(String[] args) {
        /*
        Syntax:
   for( initial ; condition ; increment / decrement)
   {
        // body of loop;
   }
         */
        System.out.println("Enter The Limit : ");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
