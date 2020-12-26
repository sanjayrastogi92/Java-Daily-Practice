package dec_26;

import java.util.Scanner;

public class StringWordCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String to Count Words In it.");
		String str = sc.nextLine();
		sc.close();
		
		int count=0;
		
		char ch[] = new char[str.length()];
		
		for(int i=0; i < str.length(); i++) {
			
			ch[i]= str.charAt(i);
			
			if(((i==0)&& ch[0]!=' ') || ((i > 0)&&ch[i]!=' ')&& ch[i-1]==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
