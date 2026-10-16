package stack_problems;

import java.util.Stack;

public class Program2 {


    public static void main(String[] args)
    {
        String s = "{[(])}";

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            } else if (ch==')' || ch=='}' || ch==']') {
                if(stack.isEmpty())
                {
                    System.out.println("NO");
                    return;
                }
                char top = stack.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='['))
                {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
