package Lec7;

import java.util.Scanner;

public class User_Input_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Display(arr);
	//	System.out.println(arr);
	}

	public static void Display(int[] arr) {
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
