package recursion_problem;

// Calculate the sum of the N natural Number
public class Program5 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sum(num)); // 15
    }

    private static int sum(int num) {
        if(num==0)
            return 0;

        return num + sum(num-1);
    }
}
