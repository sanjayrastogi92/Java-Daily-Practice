package dec_27;

import java.util.Scanner;

public class TrimFirstAndLastWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		sc.close();
		
		String trimmedString = str.substring(1, str.length()-1);
		System.out.println(trimmedString);

	}

}
