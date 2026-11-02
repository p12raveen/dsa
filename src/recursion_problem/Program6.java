package recursion_problem;

// Reverse the number
public class Program6 {
    static int rev = 0;
    public static void main(String[] args) {
        int num = 54321;
        System.out.println(reverse(num,rev)); // 12345
    }

    private static int reverse(int num,int rev) {
        if(num==0)
            return rev;
        return reverse(num/10,rev*10 + num%10);

    }
/*
r(54321,0)
    |
    r(5432,1)
        |
        r(543,12)
            |
            r(54,123)
               |
               r(5,1234)
                    |
                    r(0,12345)
                        |
                        terminate-> return 12345
 */

}
