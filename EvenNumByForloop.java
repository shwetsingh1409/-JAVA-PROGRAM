import java.util.Scanner;
public class EvenNumByForloop{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:: ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
            }
        }
    }

