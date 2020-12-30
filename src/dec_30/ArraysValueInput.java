package dec_30;
import java.util.*;

public class ArraysValueInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 names..!");
		String names[] = new String[5];
		
		
		for(int i=0; i < 5; i++) {
			names[i] = sc.nextLine();
		}

		sc.close();
		
		for(String st : names) {
			System.out.println(st);
		}
		
	}

}
