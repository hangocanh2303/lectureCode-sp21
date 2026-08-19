All heaps in these parts are min heaps and contain N items total unless explicitly noted otherwise. Assume the internal array does not resize for
any of the specified operations.  
(b) A removeMin operation takes Θ(log N) time.  
Answer: sometimes true   
When heap only two items -> remove min take theta(1)  

(c) An add operation’s time complexity is Ω(1) and O(log N).
Answer: always true  

(d) Given a min heap with N distinct items, if you add an item that is smaller
than every item in the heap, then immediately call removeMin on that heap,
you’ll end up with the original heap before you added the item.  

Answer: always true  

(e) Given a min heap with N items (not necessarily unique), if you add an item
that is smaller than every item in the heap, then immediately call removeMin
on that heap, you’ll end up with the original heap before you added the item.
This is the same question as the previous part, but now we may have duplicate
items in the heap. Assume that we break ties when sinking by swapping with
the left child.  

Answer: sometimes true  

(f) The array representation of any min heap is in sorted order
Answer: sometimes true 

(g) If you swap every node’s left child with its right child and vice-versa, you’ll end
up with a valid min heap. This would amount to the following pseudocode:
```angular2html
 public void swapRecursive(Node root) {
     if (root == null) {return;}
     Node tmp = root.right;
     root.right = root.left;
     root.left = tmp;
     swapRecursive(root.left);
     swapRecursive(root.right);
 }
```
Answer: always true 