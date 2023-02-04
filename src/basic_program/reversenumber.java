package basic_program;
public class reversenumber {
        public static void main(String[] args)
        {
            int num = 987654, rev = 0; //temperary variable rev =0
            while(num!= 0)
            {
                rev =rev*10+num%10;
                num=num /10;
               /* int number =12345 ,reverse = 0;
                while (num != 0) {
                    int remainder = number %10;
                reverse = reverse * 10 + remainder;
                number = number/10;}*/
                }
            System.out.println("The reverse of the given number is: " + rev);

        }
    }





