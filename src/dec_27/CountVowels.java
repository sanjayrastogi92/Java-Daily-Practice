package dec_27;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		
		sc.close();
		countVowels(str);
		
		/*
		 * int numOfVowels = countVowels(str); System.out.println(numOfVowels);
		 */

	}
	
	
	public static void countVowels(String st) {
		
		String newSt = st.toUpperCase();
		int vowels =0;
		int consonent =0;
		for(int i=0; i < newSt.length(); i++) {
			
			if(newSt.charAt(i)=='A' || newSt.charAt(i)=='E' || newSt.charAt(i)=='I'||  newSt.charAt(i)=='O' || newSt.charAt(i)=='U') {
				vowels++;
			}
			else 
				consonent++;
		}
		System.out.println("No of Vowels :"+vowels);
		System.out.println("No of Consonents :"+consonent);
	}

}
