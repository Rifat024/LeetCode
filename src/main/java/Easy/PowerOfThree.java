package Easy;

import java.util.Scanner;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Integer input=myObj.nextInt();
        PowerOfThree powerOfThree=new PowerOfThree();
        System.out.println(powerOfThree.isPowerOfThree(input));

    }
}
