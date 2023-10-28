import java.util.*;
public class quickSort {
    public static void quickSort(int arr[], int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quickSort(arr,si,pidx-1); // Sorting Left from Pivot
        quickSort(arr,pidx+1,ei); // Sorting Right from Pivot
    }

    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei]; //Choosing Pivot
        int i=si-1; // tracking elements

        for(int j=si; j<ei; j++){
            if(arr[j]<pivot){
                i++;

                // Swapping
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        i++;
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;

            return i;

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int len=sc.nextInt();  //Input the length of Array
        int arr[]=new int[len];  
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();     //Input the elements of Array
        }
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
