import java.util.Scanner;
public class Perfect_Numbers {
    //Write a program to check the given number is perfect number or not.
    /*
    6 is a perfect number because 6 is divisible by 1, 2 and 3 and the sum of these values is 1 + 2 + 3 = 6. Remember, we have to exclude the number itself.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = in.nextInt();//6
        int sum=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0){
                sum+=i;//1+2+3
            }
        }
        if(sum==n){
            System.out.println(n + " is a Perfect Number");
        }else {
            System.out.println(n + " is not a Perfect Number");
        }
    }
}
