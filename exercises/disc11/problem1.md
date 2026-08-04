1 Oracle Dijkstra’s
In some graph G, we are given a sorted list of nodes, sorted by their distances from
some start vertex A. Design an efficient algorithm to find the shortest paths tree
starting from A.
Hint: Your algorithm should be more efficient than Dijkstra’s

Answer: 
A -> B -> C -> D -> E  
Don't need to use Priority Queue in this, loop in sorted list and relax same with dijkstra
