The key process in quickSort is a partition(). The target of partitions is to place the pivot (any element can be chosen to be a pivot) at its correct position in the sorted array and put all smaller elements to the left of the pivot, and all greater elements to the right of the pivot.

Partition is done recursively on each side of the pivot after the pivot is placed in its correct position and this finally sorts the array.

There are many different choices for picking pivots. 

Always pick the first element as a pivot.
Always pick the last element as a pivot.
Pick a random element as a pivot.
Pick the middle as the pivot.

#Partition Algorithm:

The logic is simple, we start from the leftmost element and keep track of the index of smaller (or equal) elements as i. While traversing, if we find a smaller element, we swap the current element with arr[i]. Otherwise, we ignore the current element.

Let us understand with the help of an example

Consider: arr[] = {10, 80, 30, 90, 40}.
Compare 10 with the pivot and as it is less than pivot arrange it accrodingly.
Compare 80 with the pivot. It is greater than pivot.
Compare 30 with pivot. It is less than pivot so arrange it accordingly.
Compare 90 with the pivot. It is greater than the pivot.
Arrange the pivot in its correct position.

Illustration of Quicksort:
As the partition process is done recursively, it keeps on putting the pivot in its actual position in the sorted array. Repeatedly putting pivots in their actual position makes the array sorted.