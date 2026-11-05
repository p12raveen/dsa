package dynamicprograming_problems;

public class Program1 {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    private static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i=2;i<=n;i++)
        {
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
