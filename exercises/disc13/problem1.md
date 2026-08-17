# 1 Quicksort  
(a) Sort the following unordered list using stable Quicksort. Assume that we always choose first
element as the pivot and that we use the 3-way merge partitioning process described in lecture.
Show the steps taken at each partitioning step.
18, 7, 22, 34, 99, 18, 11, 4  

Answer: 
Step 1: pivot 18
7 11 4 18 18 22 34 99 

Step 2: pivot 7
4 7 11

Step 3: pivot 22
22 34 99

Step 4: pivot 34

Final: 4 7 11 18 18 22 34 99


(b) What is the best and worst case running time of Quicksort with Hoare Partitioning on N elements? Given the two lists [4, 4, 4, 4, 4] 
and [1, 2, 3, 4, 5], assuming we pick the first element as
the pivot every time, which list would happen to result in better runtime?  

Best: theta(nlogn)
Worst: theta(n^2)

two lists -> worst case: [1, 2, 3, 4, 5]
best case [4, 4, 4, 4, 4]

(c) What are two techniques that can be used to reduce the probability of Quicksort taking the worst
case running time?  
Answer: shuff list and random select pivot