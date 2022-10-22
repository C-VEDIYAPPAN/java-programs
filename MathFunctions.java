public class MathFunctions {
    public static void main(String[] args) {
        /*
        The Java Math class has many methods that allows you to perform mathematical tasks on numbers. The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square and root. The java.lang.Math contains a set of basic math functions for obtaining the absolute value, highest and lowest of two values, rounding of values.

Methods:
abs() : absolute value of return to the positive value
sqrt() : The square root of the argument
max() : Maximum of the two values passed in the argument
min() : Minimum of the two values passed in the argument
ceil() : Rounds float value up to an integer value
floor() : Rounds float value down to an integer value
pow() : Value of the first parameter raised to the second parameter
         */
        //Built-in Math Function in Java
        System.out.println("Absolute value : " +Math.abs(-45));
        System.out.println("Round value : " +Math.round(2.288));
        System.out.println("Ceil value : " +Math.ceil(2.588));
        System.out.println("Floor value : " +Math.floor(2.588));

        double a = 2;
        double b = 3;
        System.out.println("Maximum number of a and b is: " +Math.max(a, b));
        System.out.println("Square root of b is: " + Math.sqrt(b));
        System.out.println("Power of a and b is: " + Math.pow(a, b));
        System.out.println("Logarithm of a is: " + Math.log(a));
        System.out.println("log10 of a is: " + Math.log10(a));
        System.out.println("Sine value of a is: " +Math.sin(a));
        System.out.println("Cosine value of a is: " +Math.cos(a));
        System.out.println("Tangent value of a is: " +Math.tan(a));
    }
}
