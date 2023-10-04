#include <iostream>
using namespace std;
void insert(int* arr, int position, int size, int val)
{
    size++;
    for(int i=size; i>=position; i--)
    {
        arr[i] = arr[i-1]; 
    }
    arr[position-1] = val;
}
void print(int* arr, int size)
{
    for(int i=0; i<size; i++)
    cout<<arr[i]<<" ";
}

int main()
{
    int arr[5] = {10,20,30,40,50};
    insert(arr, 3, 5, 60);
    print(arr, 6);
    return 0;
}