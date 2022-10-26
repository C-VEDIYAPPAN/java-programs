package vediyappan;

public class String_buffer {
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("vediyappan");
		System.out.println(buffer);
		buffer.append(" sevenhill");
		System.out.println(buffer);
		buffer.insert(10," darling");
		System.out.println(buffer);
		buffer.insert(10, "@@@");
		System.out.println(buffer);
		buffer.delete(10,13);
		System.out.println(buffer);
		System.out.println(buffer.charAt(3));
		System.out.println(buffer.length());
		System.out.println(buffer.substring(0));
		System.out.println(buffer.substring(0, 7));
		System.out.println(buffer.codePointAt(7));
		System.out.println(buffer.hashCode());
		
		StringBuffer st=new StringBuffer();
		System.out.println(st.capacity());
		st.append("vediyappan is a good programmer dont worry about that");
		System.out.println(st.capacity());
	}
	
}
