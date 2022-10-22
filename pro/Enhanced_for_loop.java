public class Enhanced_for_loop {
    public static void main(String[] args) {
        /*
        Syntax:
   for( Datatype item : array )
   {
        // body of loop;
   }

  Datatype : The Datatype of the array/collection
  Item : Each item of array/collection is assigned to this variable
  Array : An array or a collection
         */
        int numbers[]={10,20,30,40,50,60,70};
        for(int n : numbers)
        {
            System.out.println(n);
        }
    }
}
