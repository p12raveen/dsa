package recursion_problem;

import java.net.SocketOption;

public class Program1 {

    public static void main(String[] args) {
        show(5);
    }

    private static void show(int num) {

        if(num>0)
        {
            System.out.println(num);
            show(num-1); // recursive calling statement
        }
    }
}
