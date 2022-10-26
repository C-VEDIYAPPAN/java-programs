package vediyappan;

public class Toogle {

	public static void main(String[] args) {
		StringBuffer se=new StringBuffer("vediyappan is a computer science engineer");
		System.out.println("orginal string: "+se);
		for (int i=0;i<se.length();i++) {
			if(se.charAt(i)>=97 && se.charAt(i)<=122) {
				int c=(int) se.charAt(i)-32;
				se.setCharAt(i,(char)c);
			}
			else if(se.charAt(i)>=65 && se.charAt(i)<=90) {
				int c=(int) se.charAt(i)+32;
				se.setCharAt(i,(char)c);		
			}
		}
		System.out.println("After Toggle Case: "+se);

	}

}
