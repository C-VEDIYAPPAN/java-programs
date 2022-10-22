import java.util.Scanner;
public class Array {
    /*
    An array is a collection of elements of the same type placed in contiguous memory locations that can be individually referenced by using an index to a unique identifier.

Array Type : Type of the array. This can be primitive (int, long, byte) or Objects (String, MyObject, etc).

Index : Index refers to the position of a certain Object in an array.

Length : Every array, when being created, needs a set length specified. This is either done when creating an empty array (new int[3]) or implied when specifying values ({1, 2, 3}).
     */
    //Arrays in Java
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50,60,70,80,90,100};
        //Accessing Elements in array
        System.out.println(a[2]);

        //Print all Elements using for loop
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        //Print all Elements using Enhanced for loop
        for(int element : a)
        {
            System.out.println(element);
        }

        int b[]; // Declaring array
        b=new int[10]; // Allocating Memory to Array
        int [] c =new int[10]; //Combining Both Statement

        //Buy default all element have zero value
        for(int element : b)
        {
            System.out.println(element);
        }

        for(int i=0;i<3;i++)
        {
            Scanner in =new Scanner(System.in);
            System.out.println("Enter The Number");
            c[i]=in.nextInt();
        }
        for(int element : c)
        {
            System.out.println(element);
        }

    }
}
 