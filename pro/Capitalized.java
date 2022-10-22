public class Capitalized {
    public static void main(String[] args) {
        /*
        The capitalize a word is to make its first character is upper case, and the rest is lower case using looping and if statement. A for loop is a repetition control structure which allows us to write a loop that is executed a specific number of times. The if statement allows you to control if a program enters a section of code or not based on whether a given condition is true or false. The Using ASCII Numbers convert the string into Capitalized Each Word. There are 128 standard ASCII characters, numbered from 0 to 127. Extended ASCII adds another 128 values and goes to 255.
         */
        //Program to convert the given string into Capitalized Each Word.
        StringBuilder a = new StringBuilder("VediyappaN Is a HaCkeR");
        System.out.println("Original String : "+a);

        if (a.charAt(0) >= 97 && a.charAt(0) <= 122) {
            int c = (int) a.charAt(0) - 32;
            a.setCharAt(0, (char) c);
        }
        for (int i = 1; i < a.length(); i++) {

            if (a.charAt(i) == 32) {
                i++;
                if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                    int c = (int) a.charAt(i) - 32;
                    a.setCharAt(i, (char) c);
                }
            }else {
                if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                    int c = (int) a.charAt(i) + 32;
                    a.setCharAt(i, (char) c);
                }
            }
        }

        System.out.println("Capitalized Each Word String : "+a);
    }
}
