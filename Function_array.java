package vediyappan;

import java.util.Arrays;
import java.util.Scanner;

//returning arrays 
public class Function_array {
	public static int[] sortArray() {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the value "+i+ ": ");
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {
		int arr[]=sortArray();
		for (int a:arr)
			System.out.println(a);
		
	}

}
