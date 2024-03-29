package Easy;

public class Sqrt {
    public int mySqrt(int x) {
        double temp, sqrt;
        sqrt = x / 2;
        temp = 0;

        // Iterate until sqrt is different of temp, that is updated on the loop
        while (sqrt != temp) {
            // initially 0, is updated with the initial value of 128
            // (on second iteration = 65)
            // and so on
            temp = sqrt;

            // Then, replace values (256 / 128 + 128 ) / 2 = 65
            // (on second iteration 34.46923076923077)
            // and so on
            sqrt = (x / temp + temp) / 2;
        }
            return Integer.parseInt(String.valueOf(sqrt));

    }

    public static void main(String[] args) {
        int x=4;
        Sqrt sqrt=new Sqrt();
        int result= sqrt.mySqrt(x);
        System.out.println(result);
    }
}
