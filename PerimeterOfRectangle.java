import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter length");
        int l= input.nextInt() ;
        System.out.println("enter breadth");
        int b= input.nextInt();
        int Perimeter;
        Perimeter= 2*(l+b);
  System.out.println("perimeter of rectangle is "+Perimeter);
    }
  }
    

