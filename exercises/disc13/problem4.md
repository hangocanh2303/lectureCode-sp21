# 4. Bounding Practice Extra

Given an array of `n` elements, the heapification operation permutes the elements of the array into a heap. There are many solutions to the heapification problem.

One approach is **bottom-up heapification**, which treats the existing array as a heap and rearranges all nodes from the bottom up to satisfy the heap invariant.

Another is **top-down heapification**, which starts with an empty heap and inserts all elements into it.

### (a)

Why can we say that any solution for heapification requires `Ω(n)` time?

Answer: **Heapification must process at least a number of elements linear in `n`, so it cannot run faster than `Ω(n)`.**  

### (b)

Show that the worst-case runtime for top-down heapification is in `Θ(n log n)`.

Why does this mean that the optimal solution for heapification takes `O(n log n)` time?  

Answer: We have to process n elements, and each insertion can take Θ(log n) time in the worst case if the element has to sift up the heap. 
Therefore, the worst-case runtime is Θ(n log n). Since top-down heapification is a valid solution that runs in O(n log n) time, 
the optimal solution cannot take longer than this. Therefore, the optimal heapification solution takes O(n log n) time.  

### (c)

In contrast, bottom-up heapification is an `O(n)` algorithm.

Is bottom-up heapification asymptotically optimal?

Answer: Yes, theta(N)

### (d)

Show that the running time of bottom-up heapify is `Θ(n)`.

Some useful facts:

$$
\sum_{i=0}^{\infty} x^i = \frac{1}{1-x}
$$

Taking the derivative:

$$
\frac{d}{dx}\left(\sum_{i=0}^{\infty} x^i\right)
=
\frac{1}{(1-x)^2}
$$
