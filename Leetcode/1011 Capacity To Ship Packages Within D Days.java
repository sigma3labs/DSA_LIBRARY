class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0; int right = 0;
        for (int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (!condition(weights, days, mid))
                left = mid + 1;
            else
                right = mid;
        }
        return left; 
    }
    private boolean condition(int[] arr, int k, int mid) {
        int partition = 1; int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (curr + arr[i] > mid) {
                partition++;
                curr = arr[i];
            }
            else
                curr += arr[i];
        }
        if (partition <= k)
            return true;
        else
            return false;
    }
}