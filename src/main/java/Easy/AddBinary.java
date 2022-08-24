package Easy;

public class AddBinary {
    public static long toInteger(String binary) {
        long decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, (binary.length() - i - 1));
            }
        }
        return decimal;
    }
    public String addBinary(String a, String b) {

        Long int1=toInteger(a);
        Long int2=toInteger(b);
        Long sum=int1+int2;
        String result=Long.toBinaryString(sum);
         return result;
    }

    public static void main(String[] args) {
      //  "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
      //  "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        String b1="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b2="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        AddBinary addBinary=new AddBinary();
       String result= addBinary.addBinary(b1,b2);
        System.out.println(result);
      //  "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"
    }
}
