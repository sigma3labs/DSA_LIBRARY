package com.data.structures.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Approach taken from:
 *  - AlgoExpert
 *   - 2 pointer approach - Geeks for Geeks
 *   https://www.geeksforgeeks.org/check-whether-an-array-is-subarray-of-another-array/
 */
public class ValidSubsequence {

    public static void main(String[] args) {
        int Arr[] = {2, 3, 0, 5, 1, 1, 2};
        int sequence[] = {3, 0, 5, 1};
        System.out.println(isSequenceNaive(Arr,sequence)); //True
        int A[] = {1, 2, 3, 4, 5}, B[] = {2, 5, 6};
        System.out.println(isSequenceNaive(A,B)); //False
        System.out.println("Test for 2nd Method");
        //use Arrays.asList to convert it to List of Integer
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequnc = Arrays.asList(1, 6, -1, 10);
        System.out.println(isSequenceAlgo(array,sequnc));
        System.out.println(" ************");
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
        String s1 = "axc", t1 = "ahbgdc";
        System.out.println(isSubsequence(s1,t1));

    }
    @Test
    public void TestCase1() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        Assert.assertEquals(true, isSequenceAlgo(array, sequence));
    }

    //Two Pointer approach - INPUT ARRAY ARE FIXED SIZED ARRAY
    /*
        1st Iteration i=0,j=0, arr[i}=2, seq[j]=3, since they are not equal, while loop terminates
            i get incremented to 1 and j gets reset to 0
        2nd Iteration i=1,j=0 , arr[i}=3, seq[j]=3,they both match, i=2, j=1, it checks length of second array sequence.
        still withing 2nd array length, so moves to third iteration
        3rd Iteration:
            arr[2}=0, seq[1]=0,they both match, i=3, j=2, both matches
        4th Iteration:
        arr[3}=5, seq[2]=5,they both match, i=4, j=3, both matches, and so on till it reaches end of length of sequence
     */
    public static boolean isSequenceNaive(int[] arr, int[] seq){
        int n = arr.length;
        int m = seq.length;

        int i = 0, j = 0; // Two pointers to traverse the arrays
        while(i < n && j< m){ //if i < length of array && j < length of sequence
            if(arr[i] == seq[j]){ //if elements in both arrays matches, then increment both the pointers
                i++;
                j++;
                if(j == m)   //Check if still within range of 2nd array-if sub-array pointer is completely traversed, then return true
                    return true;
            } else
            {
                i = i - j + 1; //If element does not match increment i
                j = 0; //Reset j to 0---subarray is not traversed yet, reset it
            }

        }
        return false;
    }

        /*
            USING LIST ARRAY of INTEGERS
            TC - O(n) time | O(1) space - where n is length of array
         */
        public static boolean  isSequenceAlgo(List<Integer> array, List<Integer> sequence){
            int i=0, j=0;
            int n= array.size(); //get array length
            int m = sequence.size(); //get sequence length
            while(i< n && j< m){   //as long as both the arrays are in their range
                if(array.get(i)== sequence.get(j)){   //check if element at pointer i for array is equal to pointer j of sequence
                    j++;   //if true,then increment sequence pointer

                }
                i++;  //if no match found then increment array pointer
            }
            return j == m; //check if sequence size is still withing its length
        }

        //https://leetcode.com/problems/is-subsequence/
    public static boolean isSubsequence(String s, String t) {

        int i= 0;
        int j=0;
        while(i< s.length() && j< t.length()){
            if(s.charAt(i) ==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
