package dec_25;

import java.util.*;


public class ReverseWord{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse word");
		String str = sc.nextLine();
		sc.close();
		
		String tokens[] = str.split(" ");
		int tokenLen = tokens.length;
		
		for(int i=tokenLen-1; i>=0; i--) {
			System.out.print(tokens[i]+" ");
		}
	}
}