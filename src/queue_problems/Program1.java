package queue_problems;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = sc.nextInt(); // 7

        for(int i=0;i<n;i++)
        {
            int operation = sc.nextInt();
            if(operation ==1)
            {
                int customerId = sc.nextInt();
                queue.add(customerId);
            } else if (operation==2) {
                if(queue.isEmpty())
                {
                    System.out.println("Queue is Empty");
                }
                else {
                    System.out.println(queue.poll());
                }

            }
        }



    }
}
