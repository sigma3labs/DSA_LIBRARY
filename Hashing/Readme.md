# Hashing in Java

Hashing is a fundamental concept in computer science and is widely used in various applications. In Java, hashing is often used to efficiently store and retrieve data from data structures like hash tables and hash maps. In this document, we will cover the basics of hashing in Java and provide some example problems.

## Basics of Hashing

### What is Hashing?

Hashing is a process of converting data (such as strings, numbers, or objects) into a fixed-size value, usually a numerical value, called a hash code or hash value. The hash code is computed using a hash function, which takes the input data and produces a unique or nearly unique hash value.

### Hash Functions

A hash function is a mathematical function that takes an input (or "key") and returns a fixed-size output (the hash code). Good hash functions have the following properties:

- Deterministic: For the same input, the hash function always produces the same hash code.
- Fast to compute: The hash function should be efficient to compute.
- Uniform distribution: Hash codes should be uniformly distributed to minimize collisions.
- Minimizes collisions: Collisions occur when two different inputs produce the same hash code. Good hash functions aim to minimize collisions.

### Java's `hashCode()` Method

In Java, many classes have a `hashCode()` method that returns an integer representing the object's hash code. The default implementation of `hashCode()` in the `Object` class is based on the memory address of the object, but many classes override this method to provide a meaningful hash code.

## Problems

Here are some problems related to hashing in Java that you can explore:

### Problem 1: [560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/)

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

### Problem 2: 169.[ Majority Element](https://leetcode.com/problems/majority-element/description/)

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

### Problem 3: [Anagrams in a List of Strings](https://leetcode.com/problems/valid-anagram/description/)

Write a Java program to group anagrams from a list of strings. Two strings are considered anagrams if they have the same characters, but in a different order.

## Conclusion

Hashing is a powerful technique used in Java and many other programming languages to efficiently store and retrieve data. Understanding the basics of hashing and practicing with various problems can help you become a more proficient Java programmer.

Feel free to explore the provided problems and implement them in Java to deepen your understanding of hashing.

