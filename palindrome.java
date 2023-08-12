import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner hj=new Scanner(System.in);
        System.out.println("enter any number::   ");
        int n=hj.nextInt();
        int s=0;
        while(n>0){
            s=s*10+n%10;
            n/=10;
        }
        if(s==n)
        System.out.println("Palindrome Number "+n);
        else
        System.out.println("NOT");

    }   
}
