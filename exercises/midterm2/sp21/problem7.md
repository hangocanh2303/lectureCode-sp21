### Asymptotic Analysis (350 points). 
Consider the code below. Assume that h(N) runs in θ(N) time and returns a boolean.
```
    static void alpha(int N) {
        if (N % 2 == 0) { // this check is done in constant time
            return;
        }
        for (int i = 1; i < N; i *= 2) {
            if (h(i)) {
                h(i);
            }
        }
    }
```
a) alpha best (50 points). What is the best case runtime for alpha(N)?  
Answer: theta(1)  
b) alpha worst (50 points). What is the worst case runtime for alpha(N)?  
Answer: 