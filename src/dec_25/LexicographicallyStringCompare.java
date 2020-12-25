package dec_25;

import java.util.Scanner;

public class LexicographicallyStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first String");
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		//sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		System.out.println("Using compareTo() method: "+str1.compareTo(str2));
		

	}

}
