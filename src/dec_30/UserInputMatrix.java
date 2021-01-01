package dec_30;
import java.util.*;

public class UserInputMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows in matrix");
		int row = sc.nextInt();
		
		System.out.println("Please enter the number of columns in matrix");
		int column = sc.nextInt();
		
		int matrix[][] = new int[row][column];
		System.out.println("Please enter the elements in the matrix");
		
		for(int i=0; i < row; i++) {
			
			for(int j=0; j < column; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}

		sc.close();
		
		/*
		 * for(int i=0; i < row; i++) {
		 * 
		 * for(int j=0; j < column; j++) { System.out.print(matrix[i][j]+" "); }
		 * 
		 * System.out.println(); }
		 */
		
		
		for(int arr[] : matrix) {
			
			for(int a : arr) {
				System.out.print(a+ " ");
			}
			System.out.println();
		}
	}

}
