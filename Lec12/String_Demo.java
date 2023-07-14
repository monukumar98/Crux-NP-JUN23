package Lec12;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str3));
		String s1="bye";
//		String s = str1+s1;
		String s = str1.concat(s1);
		System.out.println(s);

	}

}
