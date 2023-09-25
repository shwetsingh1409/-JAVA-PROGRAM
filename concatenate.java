import java.util.*;
public class concatenate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter firts name");
        String name1 = input.nextLine();
        System.out.println("enter second name");
        String name2 = input.nextLine();
        String name3 = name1 + name2;
        System.out.println("name3 is "+name3);
    }
    
}
