2 Multiple MSTs
Recall a graph can have multiple MSTs if there are multiple spanning trees of
minimum weight.
(a) For each subpart below, select the correct option and justify your answer. If
you select “never” or “always,” provide a short explanation. If you select
“sometimes”, provide two graphs that fulfill the given properties — one with
multiple MSTs and one without. Assume G is an undirected, connected graph.

1. If none the edge weights are identical, there will
never be multiple MSTs in G.  
Justification: because if graph have multi mst, each mst have at least one another edge, but each edge have diff weight  
-> only one minimum weight -> only one mst 

2. If some of the edge weights are identical, there will
sometimes be multiple MSTs in G.  
Justification:  
multi mst: A -> B -> C -> D -> A with all edge weight is 1 
one mst: A -> B, B -> C, B -> D with all edge weight is 1  

3. If all of the edge weights are identical, there will
sometimes be multiple MSTs in G.  
Justification: same with 2


(b) Suppose we have a connected, undirected graph G with N vertices and N
edges, where all the edge weights are identical. Find the maximum and
minimum number of MSTs in G and explain your reasoning.
Minimum: 3
Maximum: N
Justification:  
undirected graph G with N vertices and N -1 edges is a tree
--> undirected graph G with N vertices and N edges have only one cycle 
each cycle have k edge, remove one edge in k edge -> create one mst
k min is 3 and k max is N

(c) It is possible that Prim’s and Kruskal’s find different MSTs on the same
graph G (as an added exercise, construct a graph where this is the case!).
Given any graph G with integer edge weights, modify G to ensure that Prim’s
and Kruskal’s will always find the same MST. You may not modify Prim’s or
Kruskal’s.
Hint: Look at subpart 1 of part a.

Answer:
It is possible that Prim’s and Kruskal’s find different MSTs on the same
graph G (as an added exercise, construct a graph where this is the case!). --> yes, with graph with multi mst, prim and kruskal can find diff mst 


Given any graph G with integer edge weights, modify G to ensure that Prim’s
and Kruskal’s will always find the same MST. You may not modify Prim’s or
Kruskal’s. -> change weight of all edge diff same 1a 
