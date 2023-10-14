#Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.

The idea is to find the pivot point, divide the array into two sub-arrays and perform a binary search.

The main idea for finding a pivot is – 

For a sorted (in increasing order) and rotated array, the pivot element is the only element for which the next element to it is smaller than it.
Using binary search based on the above idea, pivot can be found.
It can be observed that for a search space of indices in range [l, r] where the middle index is mid, 
If rotation has happened in the left half, then obviously the element at l will be greater than the one at mid.
Otherwise the left half will be sorted but the element at mid will be greater than the one at r.
After the pivot is found divide the array into two sub-arrays.
Now the individual sub-arrays are sorted so the element can be searched using Binary Search.

Find out the pivot point using binary search. We will set the low pointer as the first array index and high with the last array index.
From the high and low we will calculate the mid value. 
If the value at mid-1 is greater than the one at mid, return that value as the pivot.
Else if the value at the mid+1 is less than mid, return mid value as the pivot.
Otherwise, if the value at low position is greater than mid position, consider the left half. Otherwise, consider the right half.
Divide the array into two sub-arrays based on the pivot that was found.
Now call binary search for one of the two sub-arrays.
If the element is greater than the 0th element then search in the left array
Else search in the right array.
If the element is found in the selected sub-array then return the index
Else return -1.

Consider arr[] = {3, 4, 5, 1, 2}, key = 1

Pivot finding:

low = 0, high = 4:
        =>  mid = 2
        =>  arr[mid] = 5, arr[mid + 1] = 1
        => arr[mid] > arr[mid +1],
        => Therefore the pivot = mid = 2

Array is divided into two parts {3, 4, 5}, {1, 2}
Now  according to the conditions and the key, we need to find in the part {1, 2} 

Key Finding:

We will apply Binary search on {1, 2}. 
low = 3 , high = 4.
            =>  mid = 3
            =>  arr[mid] = 1 , key = 1, hence arr[mid] = key matches.
            =>  The required index = mid = 3

So the element is  found at index 3.