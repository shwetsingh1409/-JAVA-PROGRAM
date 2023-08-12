public class lab2 {
    int a=10;
    void display(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        lab2 t = new lab2();
        lab2 t1 = new lab2();
        System.out.println("te value of object t is ::");
        System.out.println(t.a);
        t.display();
        
        System.out.println(t.a);
        System.out.println(lab2.b);
        System.out.println(t.a);
        
    }
    
}