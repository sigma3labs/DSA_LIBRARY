import java. util.Scanner;
public class MergeSort {
    public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            
        }
    
        public static void merge_Sort(int arr[], int si, int ei){
            if(si>=ei){
                return;
            }
            int mid=si+(ei-si)/2;
            merge_Sort(arr,si,mid);
            merge_Sort(arr,mid+1,ei);
            merge(arr,si,mid,ei);
        }

        public static void  merge(int arr[], int si, int mid, int ei){
            int temp[]=new int [ei-si+1];
            int i=si; //iterator for left
            int j=mid+1; //iterator for right
            int k=0; // iterator for temporary array
    
            while(i<=mid && j<=ei){
                 if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++; 
                 }else{
                    temp[k]=arr[j];
                    j++; 
                 }
                 k++;
    
            }
    
            while(i<=mid){
                temp[k++]=arr[i++];
    
            }
    
            while(j<=ei){
                temp[k++]=arr[j++];
            }
    
            for(k=0,i=si; k<temp.length; k++,i++){
                arr[i]=temp[k];
            }
    
        }
        public static void main(String []args){
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter the length of Array: ");
            int len=sc.nextInt();

            int arr[]=new int[len];
            System.out.println("Enter the Elements of Array");
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }

            merge_Sort(arr,0,arr.length-1);
            System.out.print("Sorted Array : ");
            printArr(arr);
        }
    
    
}
