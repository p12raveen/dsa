package recursion_problem;

// Find maximum element in an array
public class Program7 {
    public static void main(String[] args) {
        int[] arr = {10,25,5,40,15};
        int index = 0;
        System.out.println(maximum(arr,index)); // 40
    }

    private static int maximum(int[] arr, int index) {
        if(index==arr.length-1)
            return arr[index];

        return Math.max(arr[index],maximum(arr,index+1));
    }
}

/*
40
 */
