import java.util.Scanner;
public class find_Alpha_digit_specCh {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String aldisp_str;
		int i, alph, digit, spl;
		alph = digit = spl = 0;
		char ch;
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digit++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digit);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}