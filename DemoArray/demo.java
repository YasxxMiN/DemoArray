import java.util.ArrayList;

/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        int arr [] = {11,9,7,5,3,2};
        int target = 9;
        boolean isBool = hasSubarrayWithSum(arr,target);
        System.out.println("isBool =" + isBool);
    }
 
    public static boolean hasSubarrayWithSum(int[] arr, int target) {
        int sum = 0;
        ArrayList<Integer> seenSums = new ArrayList<Integer>();
        seenSums.add(0);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (seenSums.contains(sum - target)) {
                return true;
            }
            seenSums.add(sum);
        }
        return false;
    }
    
    
}
