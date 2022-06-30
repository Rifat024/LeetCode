package Easy;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int tem=x;
        int sum =0,re;
        while(x!=0){
            re=x%10;
            sum=(sum*10)+re;
            x=x/10;
        }
        if(tem==sum && tem>0)
            return true;
        else if(tem!=sum || tem<0)
            return false;
        return false;
    }


    public static void main(String[] args) {
        int num=121;
        Palindrome palindrome=new Palindrome();
        boolean result=palindrome.isPalindrome(num);
        System.out.println(result);
    }
}

