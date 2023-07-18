package Lec14;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		// PrintSubSequnce(ques, "");
		System.out.println("\n" + CountSubSequnce(ques, ""));
	}
	public static int CountSubSequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");

			return 1;
		}
		char ch = ques.charAt(0);// a
		int a1 = CountSubSequnce(ques.substring(1), ans);// no
		int b1 = CountSubSequnce(ques.substring(1), ans + ch);// yes
		return a1 + b1;
	}

	public static void PrintSubSequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");

			return;
		}
		char ch = ques.charAt(0);// a
		PrintSubSequnce(ques.substring(1), ans);// no
		PrintSubSequnce(ques.substring(1), ans + ch);// yes

	}
}
