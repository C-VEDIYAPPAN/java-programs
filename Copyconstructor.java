package vediyappan;
class complex{
	private int real,imaginary;
	public complex() {
		this.real=20;
		this.imaginary=30;
	}
	public complex(int r,int i) {
		this.real=r;
		this.imaginary=i;
	}
	public String toString() {
		return "("+ real+" + "+imaginary+"i)"; 
	}
	public complex(complex o2) {
		this.real=o2.real;
		this.imaginary=o2.imaginary;
	}
}

public class Copyconstructor {

	public static void main(String[] args) {
		complex o1=new complex();
		System.out.println("objact o1: "+o1);
		
		complex o2=new complex(22,34);
		System.out.println("objact o1: "+o2);
		
		complex o3=new complex(o2);
		System.out.println("objact o1: "+o3);
	}

}
