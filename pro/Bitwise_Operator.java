public class Bitwise_Operator {
    public static void main(String[] args) {
        /*
        A shift operator performs bit manipulation on data by shifting the bits of its first operand right or left. The bitwise operators are the operators used to perform the operations on the data at the bit-level. When we perform the bitwise operations, then it is also known as bit-level programming. It consists of two digits, either 0 or 1.
Operator	Description
|	        Bitwise OR
&	        Bitwise AND
^	        Bitwise XOR
~	        Bitwise complement
<<	        Left shift
>>	        Signed right shift
>>>	        Unsigned right shift
         */
        int a=25,b=45;
        System.out.println("Bitwise And : "+(a&b));
        System.out.println("Bitwise Or : "+(a|b));
        System.out.println("Bitwise Xor : "+(a^b));
        System.out.println("Bitwise Not : "+(~a));
    }
}
