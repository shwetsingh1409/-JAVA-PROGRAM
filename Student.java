import java.util.Scanner;

public class Student { 
    Scanner sc =new Scanner(System.in);
    
    int rollno;
    String name;
    void get(){
        System.out.println("Enter roll number");
        rollno = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
    }
    void display(){
        System.out.println("roll number:" +rollno);
        System.out.println("name :" +name);
    }
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student();
           // Student s3 = new Student();
            s1.get();
            s1.display();
            s2.get();
            s2.display();
        
        }
       


    }
    

