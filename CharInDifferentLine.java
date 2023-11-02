import java.util.*;
    
public class CharInDifferentLine {
    
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                System.out.println(ch);
            }
            
        }
    }    

