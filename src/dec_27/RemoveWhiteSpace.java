package dec_27;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		sc.close();
		
		String updatedString = str.replaceAll(" ","");
		System.out.println(updatedString);
		
		String withOutSpaceString ="";
		
		//without using the replaceAll method
		for(int i=0; i < str.length(); i++) {
			
			if(str.charAt(i)==' ') {
				continue;
			}
			else
				withOutSpaceString = withOutSpaceString+str.charAt(i);
			
		}
		System.out.println(withOutSpaceString);
		

	}

}
