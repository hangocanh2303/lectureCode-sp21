# 3 Radix Sorts
(a) Sort the following list using LSD Radix Sort with counting sort. Show the steps taken after each
round of counting sort. The first row is the original list and the last two rounds are already filled
for you.  

| Round    | 30395 | 30326 | 43092 | 30315 |
|----------|------:|------:|------:|------:|
| Original | 30395 | 30326 | 43092 | 30315 |
| 1        | 43092 | 30395 | 30315 | 30326 |
| 2        | 30315 | 30326 | 43092 | 30395 |
| 3        | 43092 | 30315 | 30326 | 30395 |
| 4        | 30315 | 30326 | 30395 | 43092 |
| 5        | 30315 | 30326 | 30395 | 43092 |

(b) Sort the following list using MSD Radix Sort with counting sort. Show the steps taken after each
round of counting sort. The first row is the original list and the first three rounds are already
filled for you.  

| Round    | 30395 | 30326 | 43092 | 30315 |
|----------|------:|------:|------:|------:|
| Original | 30395 | 30326 | 43092 | 30315 |
| 1        | 30395 | 30326 | 30315 | 43092 |
| 2        | 30395 | 30326 | 30315 | 43092 |
| 3        | 30395 | 30326 | 30315 | 43092 |
| 4        | 30315 | 30326 | 30395 | 43092 |
| 5        | 30315 | 30326 | 30395 | 43092 |

(c) Give the best case runtime, worst case runtime, and whether or not the sort is stable for both
LSD and MSD radix sort. Assume we have N elements, a radix R, and a maximum number of
digits in an element W.

| Sort           | Time Complexity (Best) | Time Complexity (Worst) | Stability |
|----------------|------------------------|-------------------------|-----------|
| LSD Radix Sort | theta(WN + WR)         | theta(WN + WR)          | Yes       |
| MSD Radix Sort | theta(N + R)           | theta(WN + WR)          | Yes       |

(d) We just saw above that radix sort has great runtime with respect to the number of elements in
the list. Given this fact, should we say that radix sort is the best sort to use?  

Answer: No, in some case, radix sort slower compare sorted