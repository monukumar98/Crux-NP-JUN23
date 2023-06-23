package Lec3;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print(1+" ");
				j++;
			}
			System.out.println();
			row++;
			star += 2;// star = star+2;
			space--;

		}
	}

}
