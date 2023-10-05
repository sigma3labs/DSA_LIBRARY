import java.util.HashMap;

public class SubArray_Sum_Equals_K {
    public static void main(String[] args) {
        int arr[] = {-1, 1, 1};
        int k = 1;
        System.out.println(get_longest_subarray_sum_4(arr, k));
    }
    // Brute Force
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static int get_longest_subarray_sum_1(int arr[], int tar){
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == tar) {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    // Optimized Brute Force Approach (Cumulative Sum)
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int get_longest_subarray_sum_2(int arr[], int tar){
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == tar) {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    // Better Approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int get_longest_subarray_sum_3(int arr[], int tar){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int sum = 0;
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxlen = (sum == tar) ? Math.max(maxlen, i+1) : maxlen;

            int rem = sum - tar;

            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxlen;
    }
    // Best Approach - Optimized
    // Time Complexity: 
    // Space Complexity: 
    public static int get_longest_subarray_sum_4(int arr[], int tar){
        int right = 0,
        left = 0, 
        n = arr.length, 
        sum = arr[0], 
        maxlen = 0;

        while(right < n){
            while (left <= n && sum > tar) {
                sum -= arr[left];
                left++;
            }
            maxlen = (sum == tar) ? Math.max(right - left + 1, maxlen) : maxlen;

            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxlen;
    }

}
