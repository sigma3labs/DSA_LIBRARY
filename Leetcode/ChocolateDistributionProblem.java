/* 
Given an arraylist arr of size N, each value represents the no. of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
Output- Min diff

www.geeksforgeeks.org/chocolate-distribution-problem/
*/

//After sorting ans will be only subsequent arrays of m size
public long findMinDiff (ArrayList<Integer> a, int n, int m)
{
    Collections.sort(a);                                 //For arrays use Arrays.sort() , for any collection use Collections.sort()
    long minsofar=Integer.MAX_VALUE;
    for(int i=0;i<=a.size()-m;i++)
    {
        minsofar=((a.get(i+m-1)-a.get(i))<minsofar) ? (a.get(i+m-1)-a.get(i)) : minsofar;
    }
    return minsofar;
}
