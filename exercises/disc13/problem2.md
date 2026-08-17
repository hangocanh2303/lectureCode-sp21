# 2 Comparison Sorts Summary
(a) When choosing an appropriate algorithm, there are often several trade-offs that we need to consider. Complete the chart for the following sorting algorithms: give the expected time complexity
in the worst case, in the best case, and whether or not each sort is stable.

| Sorting Algorithm                 | Time Complexity (Best) | Time Complexity (Worst) | Stability | In Place |
|-----------------------------------|------------------------|-------------------------|-----------|----------|
| Selection Sort                    | theta(N^2)             | theta(N^2)              | No        | Yes      |
| Insertion Sort                    | theta(N)               | theta(N^2               | Yes       | Yes      |
| Heapsort                          | theta(N)               | theta(n*log(n))         | No        | Yes      |
| Mergesort                         | theta(n*log(n))        | theta(n*log(n))         | Yes       | No       |
| Quicksort (w/ Hoare Partitioning) | theta(n*log(n))        | theta(n^2)              | No        | Yes      |  

(b) For selection sort, give an example of a list where the order of equivalent items is not preserved
2a 2b 1 -> swap -> 1 2b 2a 

(c) Notice that the worst-case runtime in the comparison sorts on an N element array listed above
are lower bounded by Θ(N log N). Can there be a sort that runs faster than Θ(N log N) in the
worst-case?  

yes -> sort not compare (count sort or radix sort)