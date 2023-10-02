#Program to do selection sort in Python
def selection_sort(array, size):
    
    for i in range(0,size):
        min_index = i
        #Trying to find the minimum value in the array after i
        for j in range(i+1,size):
            if(array[j]<array[min_index]):
                min_index = j

        #Swapping array[i] <-> array[min_index]
        t = array[i]
        array[i] = array[min_index]
        array[min_index] = t

#Driver Program
arr = [9,23,343,12,421,213]
size = len(arr)
selection_sort(arr,size)
print("The sorted array : ")
print(arr)