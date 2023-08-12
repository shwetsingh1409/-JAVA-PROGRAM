import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("num is divisible by 3 & 5");
        }
        else{
            System.out.println("num is not divisible by 3 &5");
        }
    }
}
