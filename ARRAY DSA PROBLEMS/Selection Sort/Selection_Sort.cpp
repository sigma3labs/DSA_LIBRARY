#include <iostream>
using namespace std;
//Program to do Selection_Sort
void selection_sort(int arr[],int n){
    int i,j,min_index,t;
    for (i=0;i<n;i++) {
        min_index = i;

        //Finding the minimum element in the array after the index i+1
        for (j=i+1;j<n;j++) {
            if (arr[j]<arr[min_index])
                min_index = j;
        }

        //Swapping arr[i] <-> arr[min_index]
        t = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = t;
    }
}

//Driver Program
int main(){
    int array[] = {9,23,343,12,421,213};
    int size = sizeof(array)/sizeof(array[0]);
    selection_sort(array,size);
    cout<<"The array after sorting is : ";
    for(int i=0;i<size;i++)
        cout<<array[i]<<" ";
    cout<<endl;
    return 0;
}