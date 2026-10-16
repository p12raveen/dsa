package stack_problems;

import java.util.Arrays;
import java.util.Stack;

public class Program3 {


    public static void main(String[] args)
    {
        int[] height = {73,74,75,71,69,72,76,73};
        int[] answer = new int[height.length];
        // 1    1   0   0   0   0   0   0
        // -------------------------------------
        // 0    1   2   3   4   5   6   7

        Stack<Integer> stack = new Stack<>(); //[ 2  ]

        for(int i=0;i<height.length;i++) // i=2
        {
            while (!stack.isEmpty() && height[i]>height[stack.peek()])
            {
                int temp = stack.pop();
                answer[temp] = i-temp;
            }
            stack.push(i);
        }

        System.out.print(Arrays.toString(answer));

    }
}
