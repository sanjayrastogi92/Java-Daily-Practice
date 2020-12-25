package dec_14;

public class CheckPrimeFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primeNums[] = {2,3,5,7,9};
		int flag=0;
		
		for(int i=0;i<primeNums.length;i++) {
			
			for(int j=2; j<=i; j++) {
				if(primeNums[i]%j==0) {
					flag=+1;
				}
			}
			
			if(flag==0) {
				System.out.println(primeNums[i]);
			}
			else
				flag=0;
		}
	}

}
