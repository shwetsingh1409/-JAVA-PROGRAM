package LAB;

import java.util.Scanner;
public class CheckUpperLower{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in); 
    
    System.out.println("Enter the character  ");
    char ch=input.next().charAt(0);;

    if(ch>='A' && ch<='Z'){
        System.out.println(ch+" is an upper case letter ");
}
    else if(ch>='a' && ch<='z'){
        System.out.println(ch+" is a lower case letter ");
}
    else{
        System.out.println(ch+" is not a Alphabets ");
        }
    }
}
