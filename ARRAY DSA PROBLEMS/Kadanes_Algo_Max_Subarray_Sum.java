import java.util.Scanner;
public class Kadanes_Algo_Max_Subarray_Sum {
    public static int KadanesAlgo(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            ms=Math.max(ms, cs);
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        int arr[]={3,-2,-1,4,-6};
        System.out.println(KadanesAlgo(arr));
    }
}
