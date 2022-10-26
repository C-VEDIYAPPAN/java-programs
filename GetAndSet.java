package vediyappan;
class ShapeRectangle{
	private int length,width;
	
	int getlength() {
		return length;
	}
	int getwidth() {
		return width;  
	}
	
	void setlength(int l) {
		if(l>0)
		length=l;
		else
			length=0;
	}
	void setwidth(int w) {
		if(w>=0)
		width=w;
		else
			width=0;
	}
	int area() {
		int a=length*width;
		return a;
	}
}

public class GetAndSet {

	public static void main(String[] args) {
		ShapeRectangle o1=new ShapeRectangle();
		o1.setlength(10);
		o1.setwidth(20);
		System.out.println("Length: "+o1.getlength());
		System.out.println("Width: "+o1.getwidth()); 
		System.out.println("Area of Rectangle: "+o1.area());
		
		ShapeRectangle o2=new ShapeRectangle();
		o2.setlength(200);
		o2.setwidth(400);
		System.out.println("Length: "+o2.getlength());
		System.out.println("Width: "+o2.getwidth()); 
		System.out.println("Area of Rectangle: "+o2.area());
	}

}
