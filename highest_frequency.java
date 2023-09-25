import java.util.*;
public class highest_frequency {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any string");
    String st = input.nextLine();
    st=st.toLowerCase();
    int[] b= new int[26];
    for(int i=0; i<st.length(); i++){
        b[st.charAt(i)- 'a']++;
    }
    int max=b[0], index=-1,i;
    for(i=1; i<b.length;i++){
        if(b[i]>max){
            max=b[i];
            index=i;
        }

    }
    System.out.println((char)(index+97));

    }
    
    
}
