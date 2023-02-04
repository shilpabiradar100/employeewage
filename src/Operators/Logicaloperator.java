package Operators;

public class Logicaloperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x > 3 && x < 10); // returns true because 10 is greater than 3 AND 10 is less than 10
        System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (10 is greater than 3, but 10 is not less than 4)
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
    }
}
