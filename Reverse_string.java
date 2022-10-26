package vediyappan;

public class Reverse_string {

	public static void main(String[] args) {
		StringBuffer ve=new StringBuffer("Vediyappan is a good boy");
		System.out.println("Before: "+ve);
		if (ve.charAt(0) >= 97 && ve.charAt(0)<=122) {
			int c = (int) ve.charAt(0)-32;
			ve.setCharAt(0,(char)c);	
		}
		for (int i=1;i<ve.length();i++) {
			if (ve.charAt(i) ==32) {
				i++;
				if (ve.charAt(i) >= 97 && ve.charAt(i)<=122) {
					int c=(int) ve.charAt(i) -32;
					ve.setCharAt(i,(char)c);
				}
			}else {
				if (ve.charAt(i) >= 65 && ve.charAt(i)<=90) {
					int c=(int) ve.charAt(i) +32;
					ve.setCharAt(i,(char)c);
				}
			}
		}
		System.out.println("After: "+ve);
	}

}
