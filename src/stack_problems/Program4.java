package stack_problems;

import java.util.Stack;

public class Program4 {

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
        String prefix= "";

        Stack<Character> stack = new Stack<>();
        StringBuffer postfix = new StringBuffer();

        StringBuffer reversed = new StringBuffer(infix).reverse();
        // reversed = ")C*B(+A"

        for(int i=0;i<reversed.length();i++)
        {
            char ch = reversed.charAt(i);

            if(Character.isLetter(ch))
            {
                postfix.append(ch);
            } else if (ch==')') {
                stack.push(ch);
            } else if (ch=='(') {
                while(!stack.empty() && stack.peek() !=')')
                {
                    postfix.append(stack.pop());
                }
                if(!stack.empty())
                {
                    stack.pop();
                }
            }
            else
            {
                while(!stack.empty() && stack.peek() !='(' &&
                        (priority(stack.peek())>priority(ch) || priority(stack.peek())==priority(ch)) )
                {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty())
        {
            postfix.append(stack.pop());
        }

        System.out.println(postfix.reverse().toString());

    }
}
