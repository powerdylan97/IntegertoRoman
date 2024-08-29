import java.util.Scanner;

public class IntegertoRoman {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input  a number to be converted into Roman Numerals");
		int number = scan.nextInt();
		System.out.println("The roman numeral equivalent of " + number + " is   "+ converter(number));
	}
	private static String converter(int digits) {
		StringBuilder sb = new StringBuilder();
		int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i = 0; i < vals.length && digits>0; i++) {
			while(vals[i]<=digits) {
				digits -= vals[i];
				sb.append(symbols[i]);
			}
		}
		return sb.toString();
	}
}
