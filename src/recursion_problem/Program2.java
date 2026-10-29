package recursion_problem;

public class Program2 {

    public static void main(String[] args) {
        show(5);
    }

    private static void show(int num) {

        if(num>0)
        {
            show(num-1); // recursive calling statement
            System.out.println(num);
        }
    }
}
