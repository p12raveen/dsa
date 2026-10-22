package queue_problems;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 8
        int K = sc.nextInt(); // 3

        int[] arr = new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        // arr = [1, 3, -1, -3, 5, 3, 6, 7]
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // queue = [1,2]
        StringBuffer result = new StringBuffer();
        // result = ""

        for(int i=0;i<N;i++) // i=2
        {
            // Remove index outside the current window
            while (!queue.isEmpty() && queue.peekFirst() <= i-K)
            {
                queue.poll();
            }
            // Remove smaller or equal elements from the rear end
            while (!queue.isEmpty() && arr[queue.peekLast()]<=arr[i])
            {
                queue.pollLast();
            }

            queue.addLast(i);

            // print maximum after the first complete window
            if(i>=K-1)
            {
                result.append(arr[queue.peekFirst()]).append(" ");
            }

        }
        System.out.println(result.toString());
    }
}
