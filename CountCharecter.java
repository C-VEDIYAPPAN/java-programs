package vediyappan;

public class CountCharecter {

	public static void main(String[] args) {
		StringBuilder sd=new StringBuilder("Vediyappan Age is 20");
		System.out.println(sd);
		int upper=0,lower=0,space=0,number=0,vowels=0;
		for(int i=0;i<sd.length();i++) {
			if(sd.charAt(i)>= 97 && sd.charAt(i)<=122) {
				lower++;
			}
			if(sd.charAt(i)>= 65 && sd.charAt(i)<=90) {
				upper++;
			}
			if(sd.charAt(i)==32) {
				space++;
			}
			if(sd.charAt(i)>= 48 && sd.charAt(i)<=57) {
				number++;
			}
			if(sd.charAt(i)>= 65 && sd.charAt(i)<=90) {
				upper++;
			}
			if(sd.charAt(i)=='a' || sd.charAt(i)=='e' || sd.charAt(i)=='i' || sd.charAt(i)=='o'|| sd.charAt(i)=='u'||sd.charAt(i)=='A' || sd.charAt(i)=='E' || sd.charAt(i)=='I' || sd.charAt(i)=='O'|| sd.charAt(i)=='U'){
				vowels++;
			}
		}
		System.out.println("Lowercase: "+lower);
		System.out.println("Uppercase: "+upper);
		System.out.println("Space: "+space);
		System.out.println("Number: "+number);
		System.out.println("Vowels: "+vowels);
		System.out.println("Symbols: "+(sd.length()-(upper+lower+space+number)));
		
	}
 
}
