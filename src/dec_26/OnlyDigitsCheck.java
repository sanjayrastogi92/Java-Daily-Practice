package dec_26;

import java.util.Scanner;

public class OnlyDigitsCheck {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		boolean b=false;
		sc.close();
		
		char ch[] = new char[str.length()];
		
		for(int i=0; i < str.length(); i++) {
			
			ch[i]= str.charAt(i);
			int ascCh = ch[i];
			
			if(ascCh < 48 || ascCh >57) {
				b=true;
			}
		}

		if(b) {
			System.out.println("false");
		}
		else
			System.out.println("true");
	}

}
