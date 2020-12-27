package dec_27;

import java.util.Scanner;

public class RemoveAllNonAlphaNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		sc.close();
		
		String newString = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newString);
		
		//without using regex
		String alphaNumeric = "";
		for(int i=0; i < str.length(); i++) {
			
			int ch = (int)str.charAt(i);
			if( (ch < 48 || ch > 57) && (ch < 65 || ch > 90) && (ch < 97 || ch > 122)) {
				continue;
			}
			else
				alphaNumeric = alphaNumeric+str.charAt(i);
		}

		System.out.println(alphaNumeric);
	}

}
