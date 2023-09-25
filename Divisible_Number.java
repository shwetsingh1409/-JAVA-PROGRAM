import java.util.Scanner;
public class Divisible_Number {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%5==0){
            System.out.println("num is divisible by 5");
        }
        else if(num%11==0){
            System.out.println("num is divisible by 11");
        }
        else{
            System.out.println("num is not divisible by 5 &11");
        }
    }
}
