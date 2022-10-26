package vediyappan;
class demo {
	public int m,n;
		
	demo(int x,int y){
		m=x;
		n=y;
	}
	int largest() {
		if(m>n)
			return m;
		else
			return n;
	}
	void display() {
		int large=largest();
		System.out.println("The greatst number is : "+large);
	}
}

public class Nesting_Methods {

	public static void main(String[] args) {
		demo o1=new demo(10,20);
		o1.display();
		

	}

}
