package Easy;

public class LengthOfLastWorld {
    public int lengthOfLastWord(String s) {

        int length=0;
        String str=s.trim();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' ')
                length=0;
            else
                length++;
        }
      return length;
    }

    public static void main(String[] args) {
        String input="Hello world";
        LengthOfLastWorld length=new LengthOfLastWorld();
        int result=length.lengthOfLastWord(input);
        System.out.println(result);
    }
}
