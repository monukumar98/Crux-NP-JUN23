package Lec1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 53;
		if (m >= 75) {
			System.out.println("Garde A");
		} else if (m >= 65 && m < 75) {
			System.out.println("Garde B");
		} else if (m >= 55 && m < 65) {
			System.out.println("Garde C");
		} else if (m >= 45 && m < 55) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
