package Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder longestCommonPrefix = new StringBuilder();

        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }

        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }

        for (int i = 0; i < minimumLength; i++) {

            char current = strs[0].charAt(i);

            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }


    public static void main(String[] args) {
        String[] strs=new String[]{"flower", "flow", "flight"};
        for (int i=0;i<strs.length;i++)
            System.out.println(strs[i]);
        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
        String result= longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(result);
    }
}

