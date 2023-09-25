import java.util.*;
public class Lower_Upper_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter lowercase");
        String n1 = input.nextLine();
        System.out.println("enter upper case");
        String n2 = input.nextLine();
        System.out.println("lower to upper case "+n1.toUpperCase());
        System.out.println("upper to lower case "+n1.toLowerCase());
    }
}
