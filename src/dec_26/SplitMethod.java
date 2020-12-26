package dec_26;

import java.util.Scanner;

public class SplitMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any string");
		String str = sc.nextLine();
		sc.close();
		
		String tokens[] = str.split("[, .?@!']+");
		
		for(String s : tokens) {
			System.out.println(s);
		}
	}

}
