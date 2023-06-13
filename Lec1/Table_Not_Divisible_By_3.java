package Lec1;
public class Table_Not_Divisible_By_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int i = 1;

		while (i <= 10) {
			int tab = n * i;
			if (tab % 3 != 0) {
				System.out.println(tab);
			}
			i++;
		}

	}

}
