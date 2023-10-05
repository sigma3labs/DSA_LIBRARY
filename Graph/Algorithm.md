#Question: Breadth First Search for a Graph

How does BFS work?
Starting from the root, all the nodes at a particular level are visited first and then the nodes of the next level are traversed till all the nodes are visited.

To do this a queue is used. All the adjacent unvisited nodes of the current level are pushed into the queue and the nodes of the current level are marked visited and popped from the queue.

Illustration:

Let us understand the working of the algorithm with the help of the following example.

Step1: Initially queue and visited arrays are empty.

Step2: Push node 0 into queue and mark it visited.

Step 3: Remove node 0 from the front of queue and visit the unvisited neighbours and push them into queue.

Step 4: Remove node 1 from the front of queue and visit the unvisited neighbours and push them into queue.

Step 5: Remove node 2 from the front of queue and visit the unvisited neighbours and push them into queue.

Step 6: Remove node 3 from the front of queue and visit the unvisited neighbours and push them into queue. 
As we can see that every neighbours of node 3 is visited, so move to the next node that are in the front of the queue.

Steps 7: Remove node 4 from the front of queue and visit the unvisited neighbours and push them into queue. 
As we can see that every neighbours of node 4 are visited, so move to the next node that is in the front of the queue.

Now, Queue becomes empty, So, terminate these process of iteration.