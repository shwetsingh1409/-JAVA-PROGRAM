import java.util.Scanner;
public class Specialprogram{
    public static void main(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Number:");
        int x= input.nextInt();
        int t=x,s=0;
        while(t>0){
            int h=t%10;
            s+=s*10+h;
            t/=10;
        }
        if(s==x){
        System.out.println("Palindrome Number");
        }
        else{
        System.out.println("Not Palindrome");
        }
    }
}