package dec_25;
import java.util.*;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		System.out.println("Reversed string using For loop is "+revStringUsingFor(str));
		System.out.println("Reversed string using While loop is "+revStringUsingWhile(str));
		System.out.println("Reversed string using Do-While loop is "+revStringUsingDoWhile(str));
		sc.close();
	}
	
	//using for loop
	public static String revStringUsingFor(String s) {
		String revStr = "";
		
		for(int i=s.length()-1; i >= 0;i--) {
			revStr = revStr+s.charAt(i);
			
		}
		return revStr;
	}
	
	//using while loop
	public static String revStringUsingWhile(String st) {
		
		String newStr = "";
		int x=st.length()-1;
		
		while(x>=0) {
			newStr = newStr+st.charAt(x);
			x--;
		}
		return newStr;
	}
	
	//using do-while loop
	public static String revStringUsingDoWhile(String st1) {
		String revStr1 ="";
		int l= st1.length()-1;
		
		do {
			revStr1 = revStr1+st1.charAt(l);
			l--;
			
		}while(l>=0);
		
		return revStr1;
	}

}
