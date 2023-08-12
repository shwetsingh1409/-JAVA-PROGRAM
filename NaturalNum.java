import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
        System.out.println(i);
        }
    }
}
