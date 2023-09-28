import java.util.*;

public class palindrome_str {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = "";
        for(int i= str1.length()-1; i>=0; i--){
            str2=str2+ str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
    
        }
        
    }
}
