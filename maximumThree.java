import java.util.Scanner;
public class maximumThree{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first no.");
        int n1 = input.nextInt();
        System.out.println("enter second no.");
        int n2 = input.nextInt();
        System.out.println("enter third no.");
        int n3 = input.nextInt();
        
        if(n1>=n2 && n1>=n3){
            System.out.println("n1 is greater");
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println("n3 is greater");
          }
        else{
            System.out.println("n3 is greater");
            
        } 
    }
  }
