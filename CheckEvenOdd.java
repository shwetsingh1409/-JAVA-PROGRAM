import java.util.*;
public class CheckEvenOdd{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no.");
        int a = input.nextInt();
        
        if(a%2==0){
            System.out.println("no. is even");
        }
        else{
            System.out.println("no. is odd");
        }
    }
} 