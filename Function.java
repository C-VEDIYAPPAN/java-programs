package vediyappan;

class methods{
	public void add()
	{
		//no return without arguments
		int a=123;
		int b=105;
		System.out.println("Addtion: "+(a+b));
	}
	//no return with argument
	public void sub(int x,int y) {
		System.out.println("Subtraction: "+(x-y));
	}
	//return without argument
	public int mul() {
		int a,b;
		a=23;
		b=45;
		return a*b;
	}
	//return with argument
	public float div(int x,int y) {
		return(x/y);
	}
}

public class Function{
	public static void main(String[] args) {
		
		methods o=new methods();
		o.add();
		o.sub(4, 6);
		System.out.println("multiplication: "+o.mul());
		System.out.println("Division: "+o.div(20, 4));	
	}
}

