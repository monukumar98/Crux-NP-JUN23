package Lec45;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abaaaabaaaabbaaaa";
		int k = 2;
		int flipa = LengthofString(s, k, 'a');
		int flipb = LengthofString(s, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int LengthofString(String s, int k, char ch) {
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// grow;
			if (s.charAt(ei) == ch) {
				flip++;
			}
			// shring
			while (flip > k) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans calculate
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
