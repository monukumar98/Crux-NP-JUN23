package Lec19;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == word.charAt(0)) {
					boolean ans = Search(maze, i, j, word, 0);
					if (ans) {
						System.out.println(ans);
						return;
					}
				}

			}
		}
		System.out.println(false);
	}

	public static boolean Search(char[][] maze, int row, int col, String word, int idx) {
		// TODO Auto-generated method stub
		if (idx == word.length()) {
			return true;
		}
		if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || word.charAt(idx) != maze[row][col]) {
			return false;
		}
		maze[row][col] = '*';
		int[] r = { -1, 0, 0, 1 };
		int[] c = { 0, -1, 1, 0 };
		for (int i = 0; i < c.length; i++) {
			boolean ans = Search(maze, row + r[i], col + c[i], word, idx + 1);
			if (ans) {
				return ans;
			}
		}
		maze[row][col] = word.charAt(idx);
		return false;
	}

}
