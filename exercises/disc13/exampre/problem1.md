# 1 Sorted Runtimes

We want to sort an array of N unique numbers in ascending order. Determine the  
best case and worst case runtimes of the following sorts:

### (a)

Once the runs in merge sort are of size <= N/100, we perform insertion sort  
on them.

- Best Case: Θ(n)
- Worst Case: Θ(n^2)

### (b)

We can only swap adjacent elements in selection sort.

- Best Case: Θ(n^2)
- Worst Case: Θ(n^2)

### (c)

We use a linear time median finding algorithm to select the pivot in quicksort.

- Best Case: Θ(nlogn)
- Worst Case: Θ(nlogn)

### (d)

We implement heapsort with a min-heap instead of a max-heap. You may  
modify heapsort but must maintain constant space complexity.

- Best Case: Θ(nlogn)
- Worst Case: Θ(nlogn)

### (e)

We run an optimal sorting algorithm of our choosing knowing:

- There are at most N inversions
    - Best Case: Θ(N)
    - Worst Case: Θ(N)

- There is exactly 1 inversion
    - Best Case: Θ(1)
    - Worst Case: Θ(N)

- There are exactly (N2 − N)/2 inversions
    - Best Case: Θ(N)
    - Worst Case: Θ(N)