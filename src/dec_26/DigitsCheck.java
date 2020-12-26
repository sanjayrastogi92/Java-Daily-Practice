package dec_26;

import java.util.Scanner;

public class DigitsCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		boolean b=false;
		sc.close();
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)< '0' || str.charAt(i) > '9') {
				b = true;
			}
		}
		if(b) {
			System.out.println("false");
		}
		else
			System.out.println("true");
	}

}
