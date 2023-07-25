package Lec16;

public class TOH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		toh(n, "A", "B", "C");

	}

	public static void toh(int n, String src, String hlp, String des) {
		// TODO Auto-generated method stub
		   if (n == 0) {
			return;
		   }
		    toh(n - 1, src, des, hlp);
		System.out.println("Move " + n + "th disc from " + src + " to " + des);
		   toh(n - 1, hlp, src, des);
	}

}
