//*link : https://leetcode.com/problems/binary-tree-level-order-traversal/

//*Description: Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

// C++ program to print level order traversal
#include <bits/stdc++.h>
using namespace std;

// A Binary Tree Node
struct Node
{
	int data;
	struct Node *left, *right;
};

// Iterative method to find height of Binary Tree
void printLevelOrder(Node *root)
{
	// Base Case
	if (root == NULL)
		return;

	// Create an empty queue for level order traversal
	queue<Node *> q;

	// Enqueue Root and initialize height
	q.push(root);

	while (q.empty() == false)
	{

		// Print front of queue and remove it from queue
		Node *node = q.front();
		cout << node->data << " ";
		q.pop();

		// Enqueue left child
		if (node->left != NULL)
			q.push(node->left);

		// Enqueue right child
		if (node->right != NULL)
			q.push(node->right);
	}
}

// Utility function to create a new tree node
Node *newNode(int data)
{
	Node *temp = new Node;
	temp->data = data;
	temp->left = temp->right = NULL;
	return temp;
}

// Driver program to test above functions
int main()
{
	// Let us create binary tree shown in above diagram
	Node *root = newNode(1);
	root->left = newNode(2);
	root->right = newNode(3);
	root->left->left = newNode(4);
	root->left->right = newNode(5);

	cout << "Level Order traversal of binary tree is \n";
	printLevelOrder(root);
	return 0;
}

/**
 * ? Intution:
 * *We need to visit the nodes in a lower level before any node in a higher level, this idea is quite similar to that of a queue. Push the nodes of a lower level in the queue. When any node is visited, pop that node from the queue and push the child of that node in the queue.
 * *This ensures that the node of a lower level are visited prior to any node of a higher level.
 * ? Time Complexity: O(N) where N is the number of nodes in the binary tree.
 * ? Auxiliary Space: O(N) where N is the number of nodes in the binary tree.
 */