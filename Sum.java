import java.util.Scanner;
public class Sum {
    public static void main(String args[]){    
        Scanner input = new Scanner(System.in);
        System.out.println("enter first no.");
        int n1 = input.nextInt();
        System.out.println("enter second no.");
        int n2 = input.nextInt();
        int sum;
        sum = n1 + n2;  
        System.out.println("The sum of numbers is: "+sum);  
    }  
}  

