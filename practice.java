public class practice{
    public static void main(String[] args) {
        String a="java";
        String b="java";
        String c=new String("java").intern();
        String d =new String("java").intern();
        System.out.println(a==b);
        System.out.println(c==d);
    }
}