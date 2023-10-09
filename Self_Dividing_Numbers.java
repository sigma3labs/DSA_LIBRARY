class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            if (i < 10) {
                ans.add(i);
            }
            else {
                int num = i;
                boolean isSelfDividing = true;
                while (num > 0) {
                    int digit = num % 10;
                    if (digit == 0 || i % digit != 0) {
                        isSelfDividing = false;
                        break;
                    }
                    num /= 10;
                }
                if (isSelfDividing) {
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}
