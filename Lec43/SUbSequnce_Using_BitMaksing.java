package Lec43;

public class SUbSequnce_Using_BitMaksing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintSUbSequnce(str);

	}

	public static void PrintSUbSequnce(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			Pattern(s, i);

		}
	}

	private static void Pattern(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i >>= 1;// i = i>>1
		}
		System.out.println();

	}

}
