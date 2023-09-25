import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string");
        String S= input.nextLine();
        String g ="";
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)>=97 && S.charAt(i)<=122){
                g=g+(char)(S.charAt(i)-32);
            }
            else{
                g=g+(char)(S.charAt(i)+32);
            }

        }
        System.out.println(g);
    }
    
}
