# Assignment 3: Sorting and Searching Algorithm Analysis

## A. Project Overview
In this project, I implemented and compared different sorting and searching algorithms. The main goal was to analyze their performance using execution time and understand how algorithm efficiency changes depending on input size and data type.

The project focuses on comparing a simple algorithm (Bubble Sort) with a more efficient one (Quick Sort), as well as analyzing a basic searching method (Linear Search).

I used:
- Bubble Sort (basic sorting algorithm)
- Quick Sort (advanced sorting algorithm)
- Linear Search (searching algorithm)

---
## B. Algorithm Descriptions

### Bubble Sort
Bubble Sort is one of the simplest and most intuitive sorting algorithms. It works by repeatedly comparing adjacent elements in the array and swapping them if they are in the wrong order. This process continues through multiple passes until no more swaps are needed, which means the array is sorted.

The algorithm is called "Bubble Sort" because the largest elements gradually "bubble up" to the end of the array after each pass.

Although Bubble Sort is easy to understand and implement, it is highly inefficient for large datasets because it compares every possible pair of adjacent elements multiple times.

Advantages:
- Very simple to implement
- Does not require additional memory (in-place)

Disadvantages:
- Very slow for large datasets
- Performs many unnecessary comparisons

Time Complexity:
- Best case: O(n) (when the array is already sorted)
- Average case: O(n²)
- Worst case: O(n²)
---

### Quick Sort
Quick Sort is a highly efficient and widely used sorting algorithm based on the divide-and-conquer strategy. It works by selecting a pivot element from the array and partitioning the remaining elements into two groups: those less than the pivot and those greater than the pivot.

After partitioning, the algorithm recursively sorts the left and right subarrays. This process continues until the entire array is sorted.

The efficiency of Quick Sort comes from reducing the problem size at each recursive step, making it significantly faster than simple algorithms like Bubble Sort.

Advantages:
- Very fast for large datasets
- Efficient average-case performance
- Works in-place (no extra memory needed)

Disadvantages:
- Performance depends on pivot choice
- Worst case can be slow if pivot is poorly chosen

Time Complexity:
- Best case: O(n log n)
- Average case: O(n log n)
- Worst case: O(n²)

---
### Linear Search
Linear Search is the most basic searching algorithm. It works by scanning each element of the array one by one until the target value is found or the end of the array is reached.

Unlike Binary Search, Linear Search does not require the array to be sorted, which makes it very flexible but less efficient for large datasets.

It is commonly used when working with small datasets or unsorted data.

Advantages:
- Very simple to implement
- Works on both sorted and unsorted arrays

Disadvantages:
- Inefficient for large datasets
- Requires checking each element

Time Complexity:
- Best case: O(1) (target is first element)
- Average case: O(n)
- Worst case: O(n)

---
## C. Experimental Results

I tested arrays of different sizes:
- Small (10 elements)
- Medium (100 elements)
- Large (1000 elements)

I used:
- Random arrays
- Sorted arrays
### Observations:
- Quick Sort is much faster than Bubble Sort on large arrays
- Bubble Sort becomes very slow as size increases
- Sorted arrays improve Bubble Sort performance
- Search time remains small for Linear Search

---
## D. Screenshots

### Demo (before and after sorting)
![Demo](screenshots/demo.png)

### Experiment runs
![Run1](screenshots/run1.png)
![Run2](screenshots/run2.png)
![Run3](screenshots/run3.png)

***

## E. Analysis

During this assignment, I observed that algorithm efficiency depends heavily on input size and algorithm complexity.

For small arrays, Bubble Sort can sometimes perform similarly to Quick Sort because it has very low overhead. However, as the size of the array increases, Bubble Sort becomes extremely slow due to its O(n²) time complexity.

In contrast, Quick Sort remains efficient even for large datasets because it uses a divide-and-conquer approach and has an average complexity of O(n log n).

Another important observation is the effect of sorted data. Bubble Sort performs faster on sorted arrays because it requires fewer swaps, while Quick Sort is less affected by whether the data is sorted or not.

The results clearly match the theoretical Big-O complexity:
- Bubble Sort behaves like O(n²)
- Quick Sort behaves like O(n log n)

Linear Search, although simple, is not efficient for large arrays because it checks each element sequentially.

Binary Search is more efficient (O(log n)), but it requires a sorted array. This is because it works by dividing the array into halves, which is only possible when the data is ordered.

---

## F. Reflection

In this assignment, I learned how different sorting and searching algorithms work both in theory and in practice. I understood that algorithm efficiency is extremely important when working with large datasets.

One of the key lessons was the difference between theoretical complexity (Big-O notation) and actual execution time. Even though theory predicts performance, real-world results can vary depending on input size and structure.

I also gained experience in measuring execution time using System.nanoTime(), which helped me understand how algorithms behave under different conditions.

The most challenging part of this assignment was implementing Quick Sort and understanding how recursion and pivot-based partitioning work.

---

## G. Conclusion

In conclusion, this project demonstrates that choosing the right algorithm is critical for performance.

While Bubble Sort is simple and useful for learning purposes, it is not suitable for large datasets due to its inefficiency.

Quick Sort, on the other hand, provides significantly better performance and is more practical for real-world applications.

This assignment helped me better understand algorithm design, efficiency, and the importance of selecting the correct approach depending on the problem.