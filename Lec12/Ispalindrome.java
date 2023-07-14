package Lec12;

public class Ispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		System.out.println(palindrome(s));
	}
	public static boolean palindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
