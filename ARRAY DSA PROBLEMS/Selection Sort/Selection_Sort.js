//Selection Sort
function swap(arr,i, j)
{
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
 
function selectionSort(arr,  n)
{
    var i, j, min_idx;
 
    for (i = 0; i < n-1; i++)
    {
        min_idx = i;
        for (j = i + 1; j < n; j++)
        if (arr[j] < arr[min_idx])
            min_idx = j;
 
        swap(arr,min_idx, i);
    }
}
 
function printArray( arr,  size)
{
    var i;
     for (i = 0; i < size; i++)
        console.log(arr[i] + " ");
    console.log("\n");
}
 
var arr = [8, 34, 23, 1, 9];
    var n = 5;
    selectionSort(arr, n);
    console.log("Sorted array \n");
    printArray(arr, n);