Q6.1 (4 points) What is the runtime of mulch in terms of 𝑁?
```angular2html
void mulch(int[] x) {
    int N = x.length;
    if (N <= 1) {
        return;
    }

    int[] left = new int[N/2];
    for (int i = 0; i < N/2; i += 1) {
        left[i] = x[i];
    }

    mulch(left);
    mulch(left);
}
```
Best + worst: 
i < g(N) = N/2  
i = i + 1  
f(i) = 1  
f(i0) + f(i1) + ... + f(g(N)) = 1 + 1 + ... + 1 = N / 2  
Recursion: 
each step recursion = N/2  
N/2, N/4, N/8, ..., 1 -> number of step: logN 
-> theta(NlogN)  

Q6.2 (4 points) What is the runtime of alarmJunior in terms of 𝑁?
```
    void alarmJunior(int N) {
        alarmHelper(2, N);
    }
    void alarmHelper(int i, int N) {
        if (i > N) {
            return;
        }

        System.out.println("BEEP");
        alarmHelper(i*2, N/2);
    }
```
i: 2, 4, 8, 16 .... ~ 2^k  
N: N, N/2, ... ~ N/2^k  
How many step -> i > N: 2^k = N / 2^k
-> theta(logN)  

Q6.3 (4 points) Consider the BSTMap from Homework 9. Recall that get returns null if the item is not
in the map. What is the runtime of boom in terms of 𝑁, where 𝑁 = map.size()?  
Note: The runtime of the compareTo method of the Laboohoo class is constant.
```
void boom(BSTMap<Integer, Laboohoo> map) {
    for (int i = 0; i < map.size(); i += 1) {
        System.out.println(map.get(i));
    }
}
```
i < g(N) = N  
i = i + 1  
f(i) = logN 
Best:  
bst map get in theta(1): sum = 1 + 1 +  ... + 1 -> N times -> theta(N)  
Worst:  
bst map is linked-list: N + (N - 1) + ... + 1 = theta(N^2)  

Q6.4 (4 points) When Edsger Dijkstra published his original version of Dijkstra’s algorithm, he did not
use any special data structure to store the fringe.
Instead, he simply scanned the distTo array, choosing the vertex with the smallest value that was
not yet marked as previously visited.
Give a tight 𝑂 bound, in terms of 𝑉 and/or 𝐸, for the runtime of this algorithm on a graph with 𝑉
vertices and 𝐸 edges. Simplify your answer.
Assume we are using an adjacency list.

theta(V^2)



