import java.util.HashMap;

public class Count_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        int k = 6;
        System.out.println(find_all_subarray_sum1(arr, k));
        System.out.println(find_all_subarray_sum2(arr, k));
        System.out.println(find_all_subarray_sum3(arr, k));

    }
    // Brute Force Approach 
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static int find_all_subarray_sum1(int arr[], int tar){
        int n = arr.length;
        int count = 0;
        

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == tar) {
                    count++;
                }
            }
        }
        return count;
    }

    // Brute Force Optimization 
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int find_all_subarray_sum2(int arr[], int tar){
        int n = arr.length;
        int count = 0;
        

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                
                sum += arr[j];
                
                
                if (sum == tar) {
                    count++;
                }
            }
        }
        return count;
    }

    // Optimized Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int find_all_subarray_sum3(int arr[], int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0, count = 0;
        
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];

            int remove = preSum - k;

            count += map.getOrDefault(remove, 0);

            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }
        return count;
    }
}
