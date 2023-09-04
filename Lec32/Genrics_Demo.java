package Lec32;

public class Genrics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = { "Raju", "Ramu", "Kamlesh", "Kaju" };
		Integer[] arr = { 10, 23, 45, 6, 8, 90 };
		Display(arr1);
		Display(arr);

	}

	public static <T>void Display(T[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

}
