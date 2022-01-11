package day1;

public class Demo2 {

	public static void main(String[] args) {
		// star program
		for (int i = 0; i < 5; i++) {
			for(int j=4; j>i;j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
