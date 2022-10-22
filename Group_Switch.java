import java.util.Scanner;
public class Group_Switch {
    public static void main(String[] args) {
        /*
        Syntax:
    switch(expression)
    {
    case 1 :
    case 2 :
    case 3 :
    case 4 :
         // code inside the combined case
         break;
     case 5 :
    case 6 :
         // code inside the combined case value
         break;
     .
     .
     default :
         // code inside the default case .
    }
         */
        char c;
        System.out.println("Enter The Character : ");
        Scanner in =new Scanner(System.in);
        c=in.next().charAt(0);

        switch (c)
        {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a Vowels");
                break;
            default:
                System.out.println(c + " is Consonant");
                break;
        }
    }
}
