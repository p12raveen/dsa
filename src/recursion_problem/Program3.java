package recursion_problem;

public class Program3 {

    public static void main(String[] args) {
        show(3);
    }

    private static void show(int num) {

        if(num>0)
        {
            System.out.println(num);
            show(num-1);
            show(num-1);
        }
    }
}
