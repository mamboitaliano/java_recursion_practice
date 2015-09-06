package labNotGraded;
import java.util.*;
public class RecursiveMatrix {

	// Prompts user to choose a number of stars to populate ajacent side of the triangle with
	public static void main(String[] args) {
		int stars = 0;
		System.out.println("Enter number of stars: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		stars = input.nextInt();
		recursionMethod(stars);
	}
	
	// Builds triangles based on the number that make up the ajacent side
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
