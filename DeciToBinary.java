package vediyappan;

import java.util.Scanner;

public class DeciToBinary {
	public static void decimal(int n) {
		int[] binarynum =new int[1000];
		int i=0;
		while (n>0) {
			binarynum[i] =n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(binarynum[j]);
		}
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Decimal number: ");
		int a=in.nextInt();
		System.out.print("Binary no: ");
		decimal(a);

	}

}
