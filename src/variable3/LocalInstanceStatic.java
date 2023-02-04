package variable3;

public class LocalInstanceStatic {
    static int b=20; //static variable
    int c=30; // intance variable
    public static void main(String[] args)
    {
        int a=10; // local variable
        LocalInstanceStatic ref = new LocalInstanceStatic();
        System.out.println(a);
      //  System.out.println(a.b);
        System.out.println(ref.c);
    }

}