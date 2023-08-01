package Lec21;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Person p1 = new Person();
		Person p = new Person("Ankit", 22);
		System.out.println(p.name);
		p.age=-9;
		System.out.println(p.age);
//		Person p1 = new Person();
//		System.out.println(p1.name);
//		System.out.println(p1.age);

	}

}
