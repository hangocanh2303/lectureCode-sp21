3 Graph Algorithm Design
For each of the following scenarios, write a brief description for an algorithm for
finding the MST in an undirected, connected graph G.
(a) If all edges have edge weight 1. Hint: Runtime is O(V+E)
Start dfs or bfs from any vertex, if vertex unvisited -> add it to mst
Run DFS (or BFS) starting from any vertex. Whenever an unvisited vertex is reached, 
add the traversed edge to the MST. Since all edge weights are equal, 
any spanning tree is an MST. The runtime is O(V+E).

(b) If all edges have edge weight 1 or 2. Hint: Use your algorithm from part (a)
