package basic_program;

public class TypeCasting {
    public static void main(String[] args) {
        /* int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);*/



        /*double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9 */

        int a=10;
        double b=a;
        System.out.println(b); // implicit casting

        double c= 25.5;
        int d=(int)c;
        System.out.println(d); // explicitcasting
    }
}
