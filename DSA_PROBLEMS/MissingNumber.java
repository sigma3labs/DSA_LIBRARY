import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        int ans = 0;
        int spareArray[] = new int[nums.length];
        Arrays.fill(spareArray, -1);
        for(int i =0;i < nums.length;i++) {
            if(nums[i] < nums.length)spareArray[nums[i]] = 0;
        }
        for(int i =0; i< spareArray.length;i++) {
            if(spareArray[i] == -1) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}