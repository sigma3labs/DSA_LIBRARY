class Solution {
    public String reverseWords(String s) {
        char[] ans =s.toCharArray();
        int endSpace=-1;
        int en=s.length();
        for (int i=0;i<=en;i++){
            if (i==en || ans[i]==' '){
                int startIn=endSpace+1;
                int endIn=i-1;
                while (endIn>startIn){
                    char temp=ans[startIn];
                    ans[startIn]=ans[endIn];
                    ans[endIn]=temp;
                    startIn++;
                    endIn--;
                }
                endSpace=i;
            }
        }
        return new String(ans);

    }
}
