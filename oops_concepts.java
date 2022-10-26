package vediyappan;
class Rectangle{
	int length,Width;
	void getDetails(int x,int y) {
		length =x;
		Width =y;
	}
	int area() {
		int a = length*Width;
		return a;
	}
}

public class oops_concepts {
	public static void main(String[] args) {
		Rectangle o1 = new Rectangle();
		o1.length=10;
		o1.Width=20;
		System.out.println("Area of rectangle: "+o1.area());
		
		Rectangle o2 = new Rectangle();
		o2.getDetails(100,200);
		System.out.println("Area of rectangle: "+o2.area());
	}

}
