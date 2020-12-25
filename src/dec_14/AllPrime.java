package dec_14;

import java.util.*;

public class AllPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		sc.close();
		
		if(num<=1)
		{
			System.out.println("No Prime number exists.");
		}
		else
		{
		for(int i=2; i<=num;i++) {
			
			for(int j=2; j<=i/2; j++) {
				
				if(i%j==0) {
					temp = temp+1;
				}
			}
			
			if(temp==0) {
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
		}

	}
	}
}
