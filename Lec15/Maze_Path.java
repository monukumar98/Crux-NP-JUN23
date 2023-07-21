package Lec15;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 5;
		PrintPath(0, 0, n - 1, m - 1, "");
	}
	public static void PrintPath(int cr, int cc, int er, int ec, String ans) {
		// +ve base case
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}
		// -ve base case
		if (cr > er || cc > ec) {
			return;
		}
		PrintPath(cr, cc + 1, er, ec, ans + "H");// Horizontal
		PrintPath(cr+1, cc , er, ec, ans + "V");// vertical
	}
}
