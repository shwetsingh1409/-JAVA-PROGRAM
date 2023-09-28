import java.util.Scanner;
public class  Count_word {
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        String sr;
        int count=1;
        sr = sc.nextLine();
        
        for(int i = 0; i < sr.length(); i++){
            
            if(sr.charAt(i)==32 ) {
                count++;
            }
            
        }
        System.out.println(count);
    }
}
