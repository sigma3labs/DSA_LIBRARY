# Binary Search Algorithm
This repository contains a C++ implementation of the Binary Search Algorithm. Binary search is an efficient algorithm used to find a specific element in a sorted array. It works by repeatedly dividing the search interval in half until the target element is found or the search interval becomes empty.

## Code Overview
The provided C++ code demonstrates the binary search algorithm's implementation. Here's an overview of the code:

#### 1. Standard Header Files: The code includes the necessary header files and defines some common macros and constants.

#### 2. binary_search_less_equal(): This function finds the position of the first element in the vector that is less than or equal to the given value x using binary search.

#### 3. binary_search_greater(): This function finds the position of the first element in the vector that is greater than the given value x using binary search.

#### 4. solve(): The solve() function reads the input, performs the binary searches, and prints the results.

#### 5. Main Function: The main() function initializes input/output optimization, calls the solve() function, and returns 0 to indicate successful execution.

## Usage
To use the binary search algorithm implemented in this code:

Clone the repository to your local machine:
```
git clone https://github.com/your_username/your_repository.git
```
```
g++ binary_search.cpp -o binary_search
```
```
./binary_search
```
The code will output two lines:

##### 1. The first line will display the first element in the array greater than x.
##### 2. The second line will display the first element in the array less than or equal to x.

## Example
Suppose you want to find elements in an array that are greater than and less than or equal to 5. You can run the program as follows:

```
./binary_search
6 5
1 3 5 7 9 11
```

The program will output:
```
7
5
```

This indicates that the first element greater than 5 is 7, and the first element less than or equal to 5 is 5.
Feel free to modify and integrate this code into your own projects or use it as a reference for understanding binary search algorithms in C++.
