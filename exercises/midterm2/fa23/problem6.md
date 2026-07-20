b)  
```
public static void b(int N) {
    if (N <= 1) {
        return;
    }
    for (int i = 0; i < N; i += 2) {
        System.out.println("b");
    }
    b(N / 3);
    b(N / 3);
    b(N / 3);
}

```
i < g(N) = N  
f(i1) + f(i2) + f(g(N)), f(i) = 1  
f(0) + f(2) + ... + f(N) = N / 2 

call b(N/3) three times -> sum of work in each stage is N / 2  
N/3 -> <= 1 -> logN 

Best case: theta(NlogN)    
Worst case: theta(NlogN)

c)  
```
public static void c(int N) {
    Random rand = new Random();
    for (int i = 1; i < N; i *= 2) {
        for (int j = 0; j != rand.nextInt(0, i); j += 1) {
            System.out.println("c");
        }
    }
}
```
Best case:  

f(i) = theta(1), j == rand.nextInt(0, i) -> println not call   
outer loop:  
i < g(N) = N  
f(i1) + f(i2) + f(i3) + ... + f(g(N))
f(1) + f(2) + f(4) + f(8) + ... + f(N)
1 + 1 + 1 + ... + 1 (logN times)
-> theta(logN)

Worst case:   
j always != rand.nextInt(0, i) -> infinity loop 

d)  

```
public static void d(int[] arr) {
    int N = arr.length;
    BSTSet<Integer> tree = new BSTSet<>();
    /* Assume that BST implements a binary search tree
    * with no self-balancing optimizations, as seen in lecture */
    for(int i = 0; i < N; i += 1) {
        tree.insert(arr[i]);
    }
}
```

Best case:
i < g(N) = N  
i = i + 1  
f(i1) + f(i2) + f(i3) + ... + f(g(N)), f(i) = log(i)
log(0) + log(1) + log(2) + ... + log(N)
-> theta(NlogN), when input arr is same value for all items, best case is theta(N)  

Worst case: 
arr in sort order and tree is a linked-list 
f(i) = i
-> 0 + 1 + 2 + ... + N 
-> theta(N^2)  

e) 
```
public static void e(int N) {
    if (N <= 0) { return; }
    if (N % 2 == 0) { return; }
    e(N - 1);
    e(N - 2);
}
```
Best:  
N is even, N % 2 = 0 -> theta(1)  
Worst: 
N is odd, N % 2 != 0  
e(N - 1) -> even 
e(N - 2) -> odd 
-> f(N) + f(N - 2) + ... + f(0), f(i) = 1  
-> theta(N)

f)

```
public static void f(int N) {
    if (N == 1) { return; }
    if (isPowerOfTwo(N)) {
        f(N / 2);
    } else {
        f(N - 1);
    }
}
public static boolean isPowerOfTwo(int N) {
    if (N == 1) {
        return true;
    } else if (N % 2 != 0 || N == 0) {
        return false;
    } else {
        return isPowerOfTwo(N / 2);
    }
}
```
isPowerOfTwo:   
Best: when N % 2 != 0 -> theta(1)
Worst: when N is power of two -> N, N/2, N/4, 8, 4, 2, 1  
N = 2^k -> logN -> theta(logN)

Best case of f:  

when N is power of two: each f(i) = logN times
f(i1) + f(i2) + ... + f(1), f(i) = log(i)
log(N) + log(N/2) + log(N/4) + ... + log(1) -> theta(logN^2)

when N is not power of two: select branch f(N - 1), N = 2^k - 1
![img.png](img.png)