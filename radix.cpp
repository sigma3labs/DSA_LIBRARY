// C++ code for Radix Sort
#include<bits/stdc++.h>
using namespace std;

// Counting Sort function
void countingSort(int *a,int n,int div){
    // Making a count array of size 10, for counting 
    // the frequency of digits of array elements.
    int count[10];
    ;
    // Initializing all of its
    // entries with 0. 
    for(int i=0;i<10;i++){
        count[i]=0;
    }
        
    // Increasing count of kth 
    // digit of a[i].
    for(int i=0;i<n;i++)
        count[(a[i]/div)%10]++;
        
    // Updating count[i] such that count[i] now contains
    // actual position of this digit in temp[].
    for(int i=1;i<10;i++)
        count[i]+=count[i-1];
        
    // Making a temporary array for 
    // storing the output.
    int temp[n];
    
    // Building the temporary array.
    for(int i=n-1;i>-1;i--){
        temp[count[(a[i]/div)%10]-1]=a[i];
        count[(a[i]/div)%10]--;
    }
    
    // Updating the elements in array.
    for(int i=0;i<n;i++)
        a[i]=temp[i];
}

// Radix Sort function
void radixSort(int a[], int n){
    // Finding the maximum element
    // of the array.
    int max=0;
    for(int i=0;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    
    // For each digit in max, calling 
    // the countingSort for ith digit. 
    for(int div=1;max/div>0;div*=10){
        countingSort(a,n,div);
    }
}

// Main function
int main(){
    // Initializing the array.
    int a[]={4,2,12,6,1,9,21};
    int n=7;
    // Applying the Radix sort function.
    radixSort(a,n);
    
    // Printing the array.  
    for(int i=0;i<n;i++)
        cout<<a[i]<<" ";
    
    return 0;
}
