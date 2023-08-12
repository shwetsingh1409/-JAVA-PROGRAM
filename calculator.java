import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operator");
        char operator = sc.next().charAt(0);
        System.out.println("enter first no.:: ");
        double a = sc.nextInt();
        System.out.println("enter second no.:: ");
        double b = sc.nextInt();
        
        switch(operator){
            case '+' : System.out.println("sum is :"+(a+b));
            break;
            case '-' : System.out.println("sub is :"+(a-b));
            break;
            
            case '*' : System.out.println("multiplication is :"+(a*b));
            break;
            case '/' : System.out.println("division is :"+(a/b));
            break;
            case '%' : System.out.println("modulo is :"+(a%b));
            break;
            default : System.out.println("invalid operation");
        }
        
    }
}