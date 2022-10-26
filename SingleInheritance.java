package vediyappan;
class father extends son//base
{
	public void house() 
	{
		System.out.println("Father bought a new house");
	}
}
class son //derived
{
	public void car()
	{
		System.out.println("Son bought a new car");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		father o1=new father();
		o1.car();
		o1.house();
		
		

	}

}
