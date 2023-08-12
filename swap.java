import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("enter first number:  ");
        int a=k.nextInt();
        System.out.println("enter second number:: ");
        int b=k.nextInt();
        // before swap
        System.out.println(a+", " +b );
        // Swapping::
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swappping : "+a+" "+b);
    }
}
