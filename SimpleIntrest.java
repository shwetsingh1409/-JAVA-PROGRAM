import java.util.Scanner;
class SimpleIntrest
{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter principle");
    int p = input.nextInt();
    System.out.println("enter rate of intrest");
    int r = input.nextInt();
    System.out.println("enter time period");
    int t = input.nextInt();
    int SI;
      SI= (p*r*t)/100;
System.out.println("SI is "+SI);
  }
}