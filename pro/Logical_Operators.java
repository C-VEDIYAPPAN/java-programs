public class Logical_Operators {
    public static void main(String[] args) {
        /*

Operator Example	    Meaning
&&	    (Logical AND)	expression1 && expression2 true only if both expression1 and expression2 are true
||	    (Logical OR)	expression1 || expression2 true if either expression1 or expression2 is true
!	    (Logical NOT)	!expression true if expression is false and vice versa
         */
        int m1=25,m2=75;
        System.out.println("And  &&  : "+(m1>=35 && m2>=35));
        System.out.println("Or   ||  : "+(m1>=35 || m2>=35));

    }
}
