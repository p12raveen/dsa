package recursion_problem;

// Search an element using Binary Search
public class Program9 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key = 40;
        System.out.println(binarySearch(arr,0,arr.length-1,key)); // true
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        if(arr[mid]==key)
            return mid;
        if(key<arr[mid])
            return binarySearch(arr,low,mid-1,key);

        return binarySearch(arr,mid+1,high,key);
    }


}

/*
binarySearch({10,20,30,40,50},0,4,40) mid= 2
    |
    binarySearch({10,20,30,40,50},3,4,40) mid = 3
        |
        return mid = 3

 */
