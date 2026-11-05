package recursion_problem;

/*
Given a string S, generate all possible subsequence
of the string

Sol: Recursion
For every character, we have exactly two choice
    |- Include the current character
    |- Exclude the current character
 */
public class Program11 {
    public static void main(String[] args) {
        String str = "ABC";
        int index = 0;
        String result = "";
        generate(str,index,result);
    }

    private static void generate(String str, int index, String result) {
        //base case
        if(index==str.length())
        {
            System.out.println(result.isEmpty()?"\"\"":result);
            return;
        }

        //choice:1 Include the current character
        generate(str,index+1,result+str.charAt(index));

        // choice:2 Exclude the current character
        generate(str,index+1,result);
    }
}
