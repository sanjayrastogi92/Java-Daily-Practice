package dec_25;
import java.util.*;

public class StringToChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		sc.close();
		
		char ch[] = new char[str.length()];
		
		for(int i=0; i < str.length(); i++) {
			ch[i]=str.charAt(i);
		}
		
		for(char c : ch) {
			System.out.print(c+",");
		}
	}

}
