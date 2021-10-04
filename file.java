class Student
{
	public int roll no;
	public String name;
	public String course;
	public int m1,m2,m3;
	public int total()
	{
		return + + ;
	}
	public float average()
	{
		return (float)total()/3;
	}
	public char grade()
	{
		if(average()>=60)
			return 'A';
		else
			return 'B';
	}
	public String details()
	{
		return "Roll No:"+roll+"\n+"Name:"+name+"\n""Course:"+course+"\n";
	}
}
public class StudentTest
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.roll=12345;
		s.name="sahil";
		s.course="BCA"
		s.m1=70;
		s.m2=80;
		s.m3=70;
		System.out.println("Total :"+s.total());
		System.out.println("Average :"+s.average());
		System.out.println("Details:\n"+s.details());
	}
}