package dec_22;

public class FirstLastWordStringPattern {

	public static void main(String[] args) {
		String str ="Prime Minister Mr. Lal Krishan Advani";
		String tokens[] = str.split(" ");
		int len = tokens.length;
		String fVal =tokens[0];
		String secVal =tokens[1];
		System.out.println(fVal.charAt(0)+"."+secVal.charAt(0)+". "+tokens[len-1]);
		
		System.out.println(fVal.substring(0,1)+"."+secVal.substring(0,1)+". "+tokens[len-1]);
	}

}
