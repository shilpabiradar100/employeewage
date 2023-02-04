
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1, x2, y1, y2, m1, m2, n1, n2;
        //int x1, x2, y1, y2, m1, m2, n1, n2, comp;
        double length1 = 2, length2 = 4;
        String line1, line2;
        System.out.println("Hello welcome to line comparison computation program on master branch");
        System.out.print("Enter value of (x1 y1) (x2 y2) : ");
        x1 = scan.nextInt();
       //String[] args1 = args;
        //public static void main(String[]/args){
        System.out.println("Length of line 1 : " + length1);
        System.out.println("Length of line 2 : " + length2);

        if (length1 == length2) {
            System.out.println("lines are equal");
            line1 = Double.toString(length1);
            line2 = Double.toString(length2);
            int comp = line1.compareTo(line2);
            if (comp == 0) {
                System.out.println("Line 1 is equals to line 2");
            } else if (length1 > length2) {
                System.out.println("Line 1 is greater then line2");
            } else {
                System.out.println("lines are not equal");
                System.out.println("Line 2 is greater then line 1");
            }
        }
    }
}