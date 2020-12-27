package dec_27;

import java.util.Scanner;

public class InsertStringInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String str = sc.nextLine();
		
		System.out.println("Enter the string to be inserted");
		String insertString = sc.nextLine();
		
		System.out.println("Enter the Index where to append");
		int index = sc.nextInt();
		
		sc.close();
		String modifiedString =updatedString(str, insertString, index);
		System.out.println(modifiedString);
		
		//with subString method
		System.out.println(updatedStringUsingLibMethod(str, insertString, index));

	}

	
	public static String updatedString(String originalStr, String insertedStr, int value) {
		
		String newString ="";
		
		for(int i=0; i< originalStr.length(); i++) {
			
			newString += originalStr.charAt(i);
			
			if(i==value) {
				newString += insertedStr;
			}
			
		}
		return newString;
	}
	
	public static String updatedStringUsingLibMethod(String originalStr, String insertedStr, int value) {
		
		String newString ="";
		newString = originalStr.substring(0,value+1)+insertedStr+originalStr.substring(value+1);
		return newString;
	}
}
