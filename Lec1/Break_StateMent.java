package Lec1;

public class Break_StateMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int i = 2;
		int count = 0;
		while (i < n) {
			if (n % i == 0) {
				count++;
				break;
			}
			i++;
		}
		if (count >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
