package Easy;

import java.util.Scanner;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Integer input=myObj.nextInt();
        PowerOfTwo powerOfTwo=new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(input));

    }

}
