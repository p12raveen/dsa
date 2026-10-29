package recursion_problem;

public class Program4 {

    public static void main(String[] args) {

        System.out.println(show(95));
    }

    private static int show(int num) {

        if(num>100)
        {
            return num-10;
        }
        return show(show(num+11));
    }
}
