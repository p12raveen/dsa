package recursion_problem;

// Check whether a string is a palindrome
public class Program8 {
    public static void main(String[] args) {
        String s = "MADAM";
        int start = 0;
        int end = s.length()-1; // 4
        System.out.println(isPalindrome(s,start,end)); // true
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if(start>=end)
            return true;
        if(s.charAt(start)!=s.charAt(end))
            return false;
        return isPalindrome(s,start+1,end-1);
    }
}

/*
true

 */
