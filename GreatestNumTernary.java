import java.util.Scanner;
public class GreatestNumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first no.");
        int n1 = input.nextInt();
        System.out.println("enter second no.");
        int n2 = input.nextInt();
        System.out.println("enter third no.");
        int n3 = input.nextInt();
        int temp, greatest;
        temp=n1>n2?n1:n2;
        greatest=n3>temp?n3:temp;
        System.out.println("greatest no. is:: "+greatest);
    }
    
}
