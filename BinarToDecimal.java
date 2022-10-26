package vediyappan;

import java.util.Scanner;

public class BinarToDecimal {
	public static int binary2decimal(int binary) {
		int decimal=0,power=0;
		while(binary !=0)//1100 110 11 1
		{
			int remainder=binary%10;//0
			decimal+=remainder*Math.pow(2, power);//4 8
			binary =binary/10;//110 11
			power++;//1 2 3
		}
		return decimal;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Entre your Binary Number: ");
		int n=in.nextInt();
		System.out.println("Decimal number to binary: "+binary2decimal(n));
		 
	}

}
