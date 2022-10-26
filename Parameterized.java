package vediyappan;
class box{
	float length,breath;
	public box() {
		length=10;
		breath=30;
	}
	public box(int x,int y) {
		length=x;
		breath=y;
	}
	public box(int x) {
		length=breath=x;
		
	}
	float area() {
		return length*breath;
	}
}

public class Parameterized {

	public static void main(String[] args) {
		box o1=new box();
		System.out.println("Area of box : "+o1.area());

		box o2=new box(3,6);
		System.out.println("Area of box : "+o2.area());

		box o3=new box(6);
		System.out.println("Area of box : "+o3.area());
	}

} 
