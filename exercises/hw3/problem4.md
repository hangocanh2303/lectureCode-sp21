# 4 Sorting
Consider the following unsorted array.  
[234, 634, 1234, 210, 123, 542, 1021, 909, 321, 552, 135, 432, 1943, 53]  
In each column below, we give the intermediate results for some sort that has not
yet completed. The left most column a is the original array (as shown above), and
the last column i is the sorted result.  
0234    0123  0123 0053                0234 0909 1021 0053  0123 
0634    0210  0053 0123                0634 0210 0909 0123  0135
1234    0234  0135 0135                0210 1021 0542 0135  0210
0210    0542  0210 0210                0123 0321 0634 0210  0234
0123    0634  0234 0234                0542 0123 0552 0234  0321
0542    1021  0542 0321                0909 0432 0432 0321  0432
1021    1234  1021 0432                0321 0234 0053 0432  0542
0909    0321  0909 0542                0552 0634 0210 0542  0552
0321    0552  0321 0552                0135 1234 0321 0552  0634
0552    0909  0552 0634                0432 0135 0123 0634  0909
0135    0053  1234 0909                0053 0542 0135 0909  1021
0432    0135  0432 1021                1234 1943 0234 1021  1234
1943    0432  1943 1234                1021 0552 1234 1943  1943
0053    1943  0634 1943                1943 0053 1943 1234  0053
a       f     h    i                   g    b    c    d     e   
Identify each sort from the list: Insertion sort, Selection sort, Mergesort, Quicksort,
Heapsort, LSD sort, MSD sort. Each is used exactly once.  

(a) Which sort is insertion sort? Give your answer as a letter, e.g. if column b is
insertion sort, pick b.  
Answer: e   
(b) Which sort is selection sort?  
Answer: d  
(c) Which sort is Mergesort?  
Answer:  f   
(d) Which sort is Quicksort? Assume we are using the leftmost item as the pivot.  
Assume we do not shuffle. Assume we use Tony Hoare style partitioning.  
Answer:  h
(e) Which sort is Heapsort? Assume we use bottom-up heapification. Assume we
use a max heap.  
Answer: c   
(f) Which sort is LSD sort?  
Answer: b   
(g) Which sort is MSD sort?  
Answer: g   
(h) Which sort most likely has the fastest best case runtime on the array above? 
Answer: insertion sort  
The next parts will involve answering questions about sorting in general. As
before, provide a brief written justification or counter-example. We will only
grade your choice of answer, not your justification.  

(i) True or False: Suppose we run Quicksort on a sorted array of distinct elements.
Suppose our pivot selection is always the last element. Suppose we do not shuf-fle. Suppose we use Tony Hoare style partitioning. Given these suppositions,
Quicksort will take N2 time.  
Answer: True 

(j) True or False: Quicksort can be made stable using a partitioning scheme which
involves 3 different arrays, one array for items less than the pivot, one array
for items equal to the pivot, one array for items greater than the pivot.  
Answer: True   

(k) True or False: Heapsort is empirically just as fast as mergesort.  
Answer:  False  
(l) True or False: Finding and using the median element of every partition as the
pivot will usually result in an empirically faster quicksort than a quicksort that
uses a random pivot selection strategy.  

Answer:  False  
(m) True or False: The following sort is stable: We split an array up into two halves
and run insertion sort on each half. Then we merge the halves together like we
do in merge sort.  

Answer: True 