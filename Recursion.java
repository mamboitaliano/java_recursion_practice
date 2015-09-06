package labNotGraded;
import java.util.*;
public class Recursion {

	public static void main(String[] args) {
		int stars = 0;
		System.out.println("Enter number of stars: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		stars = input.nextInt();
		recursionMethod(stars);
	}
	
	public static void recursionMethod(int n) {
		if (n == 0) {
			return;
		}
		else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println("");
			recursionMethod(n - 1);
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
