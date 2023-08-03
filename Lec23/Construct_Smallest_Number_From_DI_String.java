package Lec23;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(Smallest_Number(s));
	}

	public static String Smallest_Number(String s) {
		int[] ans = new int[s.length() + 1];
		int count = 1;
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				for (int j = i - 1; j >= 0 && s.charAt(j) == 'D'; j--) {
					ans[j] = count;
					count++;

				}

			}

		}
		String s1 = "";
		for (int i = 0; i < ans.length; i++) {
			s1 = s1 + ans[i];
		}
		return s1;

	}

}
