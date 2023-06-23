package Lec3;

import java.util.Scanner;

public class Pattern27 {

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
			int val = 1;
			int j = 1;
			while (j <= star) {
				System.out.print(val + " ");
				if (j <= star / 2) {
					val++;
				} else {
					val--;
				}
				j++;
			}
			System.out.println();
			row++;
			star += 2;// star = star+2;
			space--;

		}

	}

}
