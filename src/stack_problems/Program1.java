package stack_problems;

import java.util.Stack;

public class Program1 {

    public static int priority(char ch)
    {
        if(ch=='^' || ch=='$')
            return 3;
        else if(ch=='/' || ch=='*')
            return 2;
        else if(ch=='+' || ch=='-')
            return 1;
        else
            return 0;
    }
    public static void main(String[] args)
    {
        String infix = "A+B/C*(D+E)-F";
        String postfix= "";

        Stack<Character> stack = new Stack<>();

        for (int i=0;i<infix.length();i++)
        {
            char symbol = infix.charAt(i);
            if(Character.isLetter(symbol))
            {
                postfix += symbol;
            } else if (symbol=='(') {
                stack.push(symbol);
            } else if (symbol==')') {
                while (!stack.isEmpty() && stack.peek()!='(')
                {
                    postfix += stack.pop();
                }
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else
            { //Rule:2 and 4
                while (!stack.isEmpty() && stack.peek()!='(' && priority(symbol)<=priority(stack.peek()) )
                {
                    postfix += stack.pop();
                }
                stack.push(symbol);
            }
        }
        while (!stack.isEmpty())
        {
            postfix += stack.pop();
        }

        System.out.println(postfix);
    }
}
