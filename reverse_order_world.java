import java.util.*;
public class reverse_order_world {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter string");
    String st= input.nextLine();
    String sr= "";
    for(int i=0; i<st.length(); i++){
        sr= st.charAt(i)+sr;
    }
    System.out.println(sr);
    }
    
    
}
