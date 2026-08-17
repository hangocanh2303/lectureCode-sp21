## 1 Identifying Sorts
Below you will find intermediate steps in performing various sorting algorithms
on the same input list. The steps do not necessarily represent consecutive steps
in the algorithm (that is, many steps are missing), but they are in the correct
sequence. For each of them, select the algorithm it illustrates from among the
following choices: insertion sort, selection sort, mergesort, quicksort (first element
of sequence as pivot), and heapsort. When we split an odd length array in half in
mergesort, assume the larger half is on the right.

Input list: 1429, 3291, 7683, 1337, 192, 594, 4242, 9001, 4392, 129, 1000  
(a) 
1429, 3291, 7683, 192, 1337 | 594, 4242, 9001, 4392, 129, 1000
1429, 3291, 192, 1337, 7683 | 594, 4242, 9001, 129, 1000, 4392
192, 1337, 1429, 3291, 7683 | 129, 594, 1000, 4242, 4392, 9001

answer: merge sort 

(b) 
1337, 192, 594, 129, 1000, 1429, 3291, 7683, 4242, 9001, 4392
192, 594, 129, 1000, 1337, 1429, 3291, 7683, 4242, 9001, 4392
129, 192, 594, 1000, 1337, 1429, 3291, 4242, 4392, 7683, 9001

answer: quick sort 

(c) 
1337, 1429, 3291, 7683, 192, 594, 4242, 9001, 4392, 129, 1000
192, 1337, 1429, 3291, 7683, 594, 4242, 9001, 4392, 129, 1000
192, 594, 1337, 1429, 3291, 7683, 4242, 9001, 4392, 129, 1000

answer: insertion sort 

(d) 
1429, 3291, 7683, 9001, 1000, 594, 4242, 1337, 4392, 129, 192
7683, 4392, 4242, 3291, 1000, 594, 192, 1337, 1429, 129, 9001
129, 4392, 4242, 3291, 1000, 594, 192, 1337, 1429, 7683, 9001

answer: 
heap sort 

In all these cases, the final step of the algorithm will be this:
129, 192, 594, 1000, 1337, 1429, 3291, 4242, 4392, 7683, 9001