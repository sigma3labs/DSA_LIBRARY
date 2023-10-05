// Ques--> Find the first oocurance of a given element X, given that the given array is sorted. If no occurance is found return -1.

// for eg. INPUT - arr = [2,5,5,5,6,6,6,8,9,9,9]
//                 x = 5
//         OUTPUT - 1

#include<iostream>
#include<vector>
using namespace std;

int firstOccurance(vector<int>&arr,int target){
    int low = 0, high = arr.size()-1;
    int ans = -1;
    while(low<=high){
        int mid = low + (high - low)/2;
        if(arr[mid]==target){
            ans = mid;
            high = mid-1;
        }
        else if(arr[mid]>target){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
    }
    return ans;
    
}


int main(){
    int n;
    cout<<"Enter the number of elements you want in the array: ";
    cin>>n;
    vector<int>arr;
    for(int i=0; i<n;i++){
        int x;
        cout<<"Enter the element: ";
        cin>>x;
        arr.push_back(x);
    }
    int target;
    cout<<"Enter the target element: ";
    cin>>target;
    cout<<"Fist index of target element is ";
    cout<<firstOccurance(arr,target);

    return 0;
}