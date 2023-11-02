public class ABC {
    int rollNo;
    String Name;
    float Marks;
    ABC(int rollNo, String Name ){
        this.rollNo = rollNo;
        this.Name= Name;
    }
    ABC(int rollNo, String Name , float Marks){
        this(rollNo, Name);
        this.Marks= Marks;
    }
    void display(){
        System.out.println(rollNo+" "+Name+" "+Marks);
    }
    public static void main(String[] args) {
        ABC A =new ABC(24, "Riya");
        ABC B = new ABC(34, "Ashu", 70.3f);
        A.display();
        B.display();
    }

    }
    
