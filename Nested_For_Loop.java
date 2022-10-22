public class Nested_For_Loop {
    public static void main(String[] args) {
        /*
        Syntax:
   for( initial ; Condition ; increment / decrement )  // Outer Loop Statements
   {
      for( initial ; Condition ; increment / decrement )  // Inner Loop Statements
      {
          . . . .
      }
   }
         */
        for(int i=1;i<=5;i++)//1<=5 2<=5
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
