package recursion_problem;

/*
Given a string S, generate all possible subsequence
of the string

Sol: Recursion + Backtracking
For every character, we have exactly two choice
    |- Include the current character
    |- Exclude the current character
 */
public class Program12 {
    public static void main(String[] args) {
        String str = "ABC";
        int index = 0;
        StringBuffer sb = new StringBuffer();
        generate(str,index,sb);
    }

    private static void generate(String str, int index, StringBuffer result) {
        //base case
        if(index==str.length())
        {
            if(result.length()==0)
                System.out.println("{}");
            else
                System.out.println(result);
            return;
        }

        //choice:1 Include the current character
        result.append(str.charAt(index));
        generate(str,index+1,result);

        // Backtrack: Remove the last added character
        result.deleteCharAt(result.length()-1);

        // choice:2 Exclude the current character
        generate(str,index+1,result);
    }
}


/*
    Step        Operation       Current Subsequence
    -----------------------------------------------
    1           add A           A
    2           add B           AB
    3           add C           ABC
    4           delete C        AB
 */