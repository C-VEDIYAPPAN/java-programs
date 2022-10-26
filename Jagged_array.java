package vediyappan;

import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		int[][] sales = new int[3][];
		Scanner in = new Scanner(System.in);
		String[] salsemen = {"muthu","saravanan","murali"};
		for (int i=0;i<salsemen.length;i++) {
			System.out.println("Enter number of salse made by "+salsemen[i]+":");
			int n=in.nextInt();
			sales[i]=new int[n];
			for (int j=0;j<n;j++){
				System.out.println("Enter sales: "+(j+1)+":");
				sales[i][j]=in.nextInt();
			}
		}

	}

}
 