package queue_problems;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 5
        int K = sc.nextInt(); // 3

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i=1;i<=N;i++)
        {
            queue.add(i);
        }
        // queue=[4,5,1,2]

        while(queue.size()>1)
        {
            for(int j=1;j<K;j++) // j=3
            {
                // rotate
                queue.add(queue.poll());
            }
            queue.poll();
        }

        System.out.println(queue.getFirst());
    }
}
