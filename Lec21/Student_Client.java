package Lec21;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s = new Student();
		s.Intro_yourSelf();
		s.name = "kaju";
		s.age = 18;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Raju";
		s1.age = 25;
		s1.Intro_yourSelf();
		s1.SayHey("ramu");
		s.SayHey("kmalesh");
		Student.fun(20);

	}
//	static {
//		System.out.println("I am in Static clinet");
//	}

}
