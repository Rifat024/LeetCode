package Easy;

public class ImplimentSTrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        int needleLength = needle.length();

        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {

            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String haystack="hello";
        String needle="ll";
        ImplimentSTrStr implimentSTrStr=new ImplimentSTrStr();
       int result= implimentSTrStr.strStr(haystack,needle);
        System.out.println(result);
    }
}
