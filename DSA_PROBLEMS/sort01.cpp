#include <iostream>
using namespace std;

void print(int arr[], int n)
{
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<< " ";
    }
    cout<<endl;
}

void sort01(int arr[], int n)
{
    int left=0, right=n-1;
    while(left<right)
    {
        while(arr[left]==0)
        {
            left++;
        }
        while(arr[right]==1)
        {
            right--;
        }
        if(arr[left]==1 && arr[right]==0 && left< right)
        {
            swap(arr[left], arr[right]);
            left++;
            right--;
        }
    }
}

int main()
{
    int arr[8] = {1,1,0,1,0,0,0,1};
    sort01(arr, 8);
    print(arr, 8);
    return 0;
}