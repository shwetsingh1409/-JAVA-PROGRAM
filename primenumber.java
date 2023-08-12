import java.util.Scanner;
public class primenumber{
        static int prime(int n){
            int c=0;
            for(int i=2;i<=n;i++){
                if(n%i==0)
                c++;
            }
            if(c==1)
            return n;
            else 
            return 0;
        }
    public static void main(String args[]){
        Scanner hj=new Scanner(System.in);
        System.out.println("enter no. ");
        
        int n = hj.nextInt();
        if(prime(n)==n){
            System.out.println("prime no.");
        }
        else{
            System.out.println("not prime no.");
        }

    }
}