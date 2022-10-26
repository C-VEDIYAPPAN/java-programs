package vediyappan;
class rectangleshape{
	int length,width; 
	
	public rectangleshape(){
		System.out.println("constructor called");
		length=20;
		width=30;
	}
	
	int area() {
		int a=length*width;
		return a;
	}
}

public class Constructor {
	public static void main(String[] args) {
		rectangleshape o1=new rectangleshape();
		System.out.println("Area of Rectangle: "+o1.area());
		
	}

}
