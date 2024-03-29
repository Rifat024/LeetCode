package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList();
        for (String word: words)
            if (match(word, pattern))
                ans.add(word);
        return ans;
    }

    public boolean match(String word, String pattern) {
        Map<Character, Character> m1 = new HashMap();
        Map<Character, Character> m2 = new HashMap();

        for (int i = 0; i < word.length(); ++i) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!m1.containsKey(w))
                m1.put(w, p);
            if (!m2.containsKey(p))
                m2.put(p, w);
            if (m1.get(w) != p || m2.get(p) != w)
                return false;
        }

        return true;
    }



    public static void main(String[] args) {
        String[] words=new String[]{"abc","deq","mee","aqq","dkd","ccc"};
        String pattern="eff";
        FindAndReplacePattern findAndReplacePattern=new FindAndReplacePattern();
        List<String> result=new ArrayList<>();
        result=findAndReplacePattern.findAndReplacePattern(words,pattern);
            System.out.println(result);


    }
}
