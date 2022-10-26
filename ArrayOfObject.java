package vediyappan;

class student{
	public int roll_no;
	public String name;
	student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	void print() {
		System.out.println("Student Name: "+name);
		System.out.println("Student rollNumber: "+roll_no);
		System.out.println("_______________________");
	}
}
public class ArrayOfObject {

	public static void main(String[] args) {
		student o1=new student(10,"rani");
		o1.print();
		
		student[] o2;
		o2 = new student[5];
		o2[0]=new student(01,"raghul");
		o2[1]=new student(02,"madhan");
		o2[2]=new student(03,"kasi");
		o2[3]=new student(04,"sathiyanathan");
		o2[4]=new student(05,"mani");
		for (int i=0;i<o2.length;i++) {
			o2[i].print();
		}
		
	}

}
