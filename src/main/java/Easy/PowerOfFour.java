package Easy;

import java.util.Scanner;

public class PowerOfFour {

        public boolean isPowerOfFour(int n) {
            if (n < 1) {
                return false;
            }

            while (n % 4 == 0) {
                n /= 4;
            }

            return n == 1;
        }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Integer input=myObj.nextInt();
        PowerOfFour powerOfFour=new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(input));

    }

}
