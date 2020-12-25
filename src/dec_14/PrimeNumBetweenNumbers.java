package dec_14;
import java.util.*;

public class PrimeNumBetweenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fNum = sc.nextInt();
		System.out.println("Enter the second number");
		int sNum = sc.nextInt();
		int flag=0;
		sc.close();
		
		if(fNum>sNum) {
			System.out.println("Please enter the second number greater than the first one.");
		}
		else
		{
			if(fNum<2)
				fNum=2;
			if(sNum<2)
				System.out.println("No Prime Number exists");
		for(int i=fNum; i<=sNum;i++) {
			
			for(int j=2;j<=i/2; j++) {
				if(i%j==0) {
					flag=+1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
			else
				flag=0;
		}
	}
	}
}
