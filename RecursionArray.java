package labNotGraded;

public class RecursionArray {
	
	public static void main(String[] args) {

		// Declares a new 4x4 array named "matrix"
		int[][] matrix = new int[4][4];
		
		// Populates matrix with random 0's and 1's and displays the matrix
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int)((Math.random() * 10));
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
}