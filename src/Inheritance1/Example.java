package Inheritance1;

public class Example {

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setRollno(100);
		s1.setName("Modi");
		s1.setAge(70);
		
		System.out.println("Rolllno: "+s1.getRollno());
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
	}

}
