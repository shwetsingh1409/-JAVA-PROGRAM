public class instant {
    int a=10;
    void display(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        instant t = new instant();
        instant t1 = new instant();
        System.out.println("te value of object t is ::");
        System.out.println(t.a);
        t.display();
        
        System.out.println("te value of objectb t1 is ::");
        System.out.println(t1.a);
        t1.display();
        
    }
    
}
