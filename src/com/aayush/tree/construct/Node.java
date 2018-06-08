package com.aayush.tree.construct;
// Java program to construct a tree using inorder and preorder traversal
  
/* A binary tree node has data, pointer to left child
   and a pointer to right child */
class Node 
{
    char data;
    Node left, right;
  
    Node(char item) 
    {
        data = item;
        left = right = null;
    }
}