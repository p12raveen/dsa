package recursion_problem;

import java.util.ArrayList;

public class Program13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 10;
        ArrayList<Integer> list = new ArrayList<>();
        findLongest(arr,0,0,k,list);

        if(maxLength==-1)
            System.out.println("no valid subsequence");
        else
        {
            System.out.println("Maximum Length: "+maxLength);
            System.out.println("Subsequence: "+answer);
        }
    }

    static int maxLength = -1;
    static ArrayList<Integer> answer = new ArrayList<>();
    private static void findLongest(int[] arr, int index, int sum, int k, ArrayList<Integer> list) {
        if(index==arr.length)
        {
            if(sum==k)
            {
                if(list.size()>maxLength)
                {
                    maxLength = list.size();
                    answer = new ArrayList<>(list);
                }
            }
            return;
        }
        // choice1: include
        list.add(arr[index]);
        findLongest(arr,index+1,sum+arr[index],k,list);

        // backtracking
        list.remove(list.size()-1);
        // choice2: exclude
        findLongest(arr,index+1,sum,k,list);
    }
    }

