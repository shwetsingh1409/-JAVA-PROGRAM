class A{
    String name;
    String address;
    public A(String name , String address)
    {
        this.name = name;
        this.address = address;
    }
    public void get()
    {

    }
    
}
class B extends A{
    String classs;
    String roll_number;
    public B(String name , String address,String classs,String roll_number)
    {
        super(name,address);
        this.roll_number = roll_number;
        this.classs = classs;
    }
    public void get()
    {

    }

}
class C extends B
{
    String contact_number;
    int marks;
    public C(String name , String address,String classs,String roll_number,String contact_number,int marks)
    {
        super(name, address, classs, roll_number);
        this.contact_number = contact_number;
        this.marks = marks;
    }
    public void get()
    {

    }
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Roll number : "+roll_number);
        System.out.println("Class : "+classs);
        System.out.println("Contact number : "+contact_number);
        System.out.println("Marks : "+marks);
    }

}
public class inheristance {
    public static void main(String[] args) {
        C objc = new C("Shwet Singh Suryavanshi","Ayodhya","Btech","60","8924000000",100);
        objc.display();
    }
}