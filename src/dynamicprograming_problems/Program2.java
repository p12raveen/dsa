package dynamicprograming_problems;

import java.util.Arrays;

public class Program2 {
    static int[] dp;

    public static void main(String[] args) {
        System.out.println(fab(6));
    }

    private static int fab(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fib(n);
    }
    /*      0   1   1   2   3   5   8
            -------------------------
            0   1   2   3   4   5   6
     */
    private static int fib(int n) {
        if(n<=1)
            return dp[n] = n;
        if(dp[n]!= -1)
            return dp[n];
        dp[n] = fib(n-1)+fib(n-2);
        return dp[n];
    }


}
