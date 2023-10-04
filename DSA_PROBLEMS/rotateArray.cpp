#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr)/ sizeof(arr[0]);
    rotate(arr, arr+2, arr+n); 
    //start, midddle, end arr={30, 40, 50, 10, 20}

    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<< " ";
    }
    cout<<endl;

    vector<int> v{1, 2, 3, 4, 5};
    rotate(v.begin(), v.begin()+3, v.end());
    for(int i=0; i<v.size(); i++)
    {
        cout<<v[i]<<" ";
    }cout<<endl;
    
    return 0;
}