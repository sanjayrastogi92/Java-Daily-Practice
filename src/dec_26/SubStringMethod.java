package dec_26;

import java.util.Scanner;

public class SubStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any string");
		String str = sc.nextLine();
		
		//substring(param) - used to print values from that index to end.
		System.out.println(str.substring(5));
		
		//subString(param1, param2) - used to print values from param1 to param2, where param1 is inclusive, param2 is exclusive
		
		System.out.println(str.substring(5, 11));
	}

}
