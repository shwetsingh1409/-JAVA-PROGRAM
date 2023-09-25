import java.util.Scanner;
public class  Count_Word {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String sr;
		char ch;
		sr = sc.nextLine();
		
		for(int i = 0; i < sr.length(); i++){
			ch = sr.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				i++;
			}
			else{
				System.out.println("worng input");
			}
			
		}
		System.out.println();
	}
}