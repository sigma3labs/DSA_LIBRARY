#include<iostream>
using namespace std;

int getMin(int num[], int n)
{
    int min = INT8_MAX;
    for(int i=0; i<n; i++)
    {
        if(num[i]< min)
            min = num[i];
    }
    return min;
}

int getMax(int num[], int n)
{
    int maxi = INT8_MIN;
    for(int i=0; i<n; i++)
    {
    //     if(num[i]> max)
    //         max = num[i];
        // is equivalent to 
        maxi = max(maxi, num[i]);
    }
    return maxi;
}

int main()
{
    int size;
    cin>>size;
    int num[size];
    for(int i=0; i<size; i++)
    {
        cin>> num[i];
    }
    cout << "Maximum val is : "<<getMax(num,size) <<endl;
    cout << "Minimum val is : "<<getMin(num,size) <<endl;

    return 0;
}