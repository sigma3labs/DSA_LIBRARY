class Solution {
    public int climbStairs(int n)
{
//same as fibonnacci series;
        //if(n==0 || n==1)
           // return 1;
       // return climbStairs(n-1) + climbStairs(n-2);
        
        // above soln time limit exceeded
        // we can solve it by iteration or memoization or dyanamic programing
        if(n==0 ||n==1)
            return n;
        int step1=0;
        int step2=1,ans=0;
        for(int i=0;i<n;i++){
            ans=step1+step2;
            step1=step2;
            step2=ans;
        }
        return ans;

            
        
    }
}
