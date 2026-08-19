| Vertex |                                             distTo | edgeTo                                             | PQ sau khi vertex được visit                         |
|--------|---------------------------------------------------:|----------------------------------------------------|------------------------------------------------------|
| `init` | `S:0, A:∞, B:∞, C:∞, D:∞, E:∞, F:∞, G:∞, H:∞, I:∞` | `S:-, A:-, B:-, C:-, D:-, E:-, F:-, G:-, H:-, I:-` | `{S:0, A:∞, B:∞, C:∞, D:∞, E:∞, F:∞, G:∞, H:∞, I:∞}` |
| `S`    |                               `S:0, A:1, B:2, I:4` | `A:S-A, B:S-B, I:S-I`                              | `{A:1, B:2, I:4, C:∞, D:∞, E:∞, F:∞, G:∞, H:∞}`      |
| `A`    |                               `A:1, B:2, I:3, E:1` | `A:S-A, B:S-B, I:A-I, E:A-E`                       | `{E:1, B:2, I:3, C:∞, D:∞, F:∞, G:∞, H:∞}`           |
| `E`    |                               `E:1, B:2, I:3, F:2` | `E:A-E, B:S-B, I:A-I, F:E-F`                       | `{B:2, F:2, I:3, C:∞, D:∞, G:∞, H:∞}`                |
| `B`    |                                    `B:2, I:2, C:4` | `B:S-B, I:B-I, C:B-C`                              | `{I:2, F:2, C:4, D:∞, G:∞, H:∞}`                     |
| `F`    |                                         `F:2, G:7` | `F:E-F, G:F-G`                                     | `{I:2, C:4, G:7, D:∞, H:∞}`                          |
| `I`    |                                              `I:2` | `I:B-I`                                            | `{C:4, G:7, D:∞, H:∞}`                               |
| `C`    |                                         `C:4, D:8` | `C:B-C, D:C-D`                                     | `{G:7, D:8, H:∞}`                                    |
| `G`    |                                         `G:7, D:2` | `G:F-G, D:G-D`                                     | `{D:2, H:∞}`                                         |
| `D`    |                                         `D:2, H:6` | `D:G-D, H:D-H`                                     | `{H:6}`                                              |
| `H`    |                                              `H:6` | `H:D-H`                                            | `{}`                                                 |

The next parts will involve answering questions about MSTs in general. As
before, provide a brief written justification or counter-example. We will only  
grade your choice of answer, not your justification.   

(e) Given any graph with V vertices and E edges, how many edges will the graph’s
MST have? Write your answer in terms of V and E with no spaces. Assume
the graph is connected.  

Answer: V - 1
(f) True or False. Prim’s algorithm will work with negative edge weights.  

Answer: True 
(g) True or False. It’s impossible for the MST of a graph to contain the largest
weighted edge.  
Answer: False 
(h) True or False. The Shortest Paths Tree returned by Dijkstra’s will never be a
correct MST.

Answer: False 

(i) True or False. A graph with unique edge weights will have exactly one MST.
If you’re stuck, you mind find it useful to know that Kruskal’s algorithm can
generate any MST depending on its tie-breaking scheme.  

Answer: True 

(j) True or False. A graph with non unique edge weights will always have a non
unique MST.  

Answer: False 

(k) True or False. If you take any graph G with positive edge weights and
square all the edge weights and turn it into the graph G0 will G and G0 have
all the same MSTs.  

Answer: True

(l) True or False. The minimum weight edge of any cycle in a graph G will be
part of any MST of G.  

Answer: False 