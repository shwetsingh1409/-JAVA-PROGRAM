package LAB;
import java.util.Scanner;
class  Check_Alphabet_digit_SpecialCharacter{
 public static void main(String[] args) {
  
  Scanner input =new Scanner(System.in);
  System.out.print("Enter any char : ");
  char ch=input.next().charAt(0);
  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
  {
   System.out.println(ch+" is Alphabit");
  }
  else if(ch>='0'&&ch<='9')
  {
   System.out.println(ch+" is Digit");
  }
  else
  {
   System.out.println(ch+" is spacial Symble");
  }
 }
}