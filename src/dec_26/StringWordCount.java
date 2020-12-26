package dec_26;

import java.util.Scanner;

public class StringWordCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String to Count Words In it.");
		String str = sc.nextLine();
		sc.close();
		String str1 = str.trim();
		
		int count=1;
		if(str1.length()<1)
			System.out.println(0);
		else
		{
		for(int i= 0; i < str1.length(); i++) {
			
			if(((str1.charAt(i)==' ') || (str1.charAt(i)=='\t')) && ((str1.charAt(i-1)!=' ') && (str1.charAt(i-1)!='\t'))){
				count++;
			}
		}
		System.out.println(count);
	}
	}

}
