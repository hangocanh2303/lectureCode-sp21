2 Conceptual Sorts
Answer the following questions regarding various sorting algorithms that we’ve discussed in class. 
If the question is T/F and the statement is true, provide an explanation. If the statement is false, provide a counterexample.  

(a) (T/F) Quicksort has a worst case runtime of Θ(NlogN), where N is the number
of elements in the list that we’re sorting.  

answer: F 
when list is same value or already sort -> theta(N^2)

(b) We have a system running insertion sort and we find that it’s completing
faster than expected. What could we conclude about the input to the sorting
algorithm?  

answer: arr almost sorted or array sorted 

(c) Give a 5 integer array that elicits the worst case runtime for insertion sort.  

answer: 5 4 3 2 1 

(d) (T/F) Heapsort is stable.  

answer: False 

(e) Give some reasons as to why someone would use mergesort over quicksort.  

answer: stable, make sure always theta(nlogn)

(f) You will be given an answer bank, each item of which may be used multiple
times. You may not need to use every answer, and each statement may have
more than one answer.  

A. QuickSort (in-place using Hoare partitioning and choose the leftmost item
as the pivot)
B. MergeSort
C. Selection Sort
D. Insertion Sort
E. HeapSort
N. (None of the above)  

List all letters that apply. List them in alphabetical order, or if the answer
is none of them, use N indicating none of the above. All answers refer to the
entire sorting process, not a single step of the sorting process. For each of the
problems below, assume that N indicates the number of elements being sorted.  

A, B, C:  Bounded by Ω(NlogN)lower bound.
B, E: Has a worst case runtime that is asymptotically better than Quicksort’s worstcase runtime.
C : In the worst case, performs Θ(N) pairwise swaps of elements.
A, B, D: Never compares the same two elements twice.
N: Runs in best case Θ(logN) time for certain inputs
