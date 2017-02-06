package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/19/16.
 */
public class BinaryTree {
    static Node root;

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static Node sortedArrayToBST(int[] a , int start , int end){
         if(start > end){
             return null;
         }
        int mid = (start+end)/2;
        Node node = new Node(a[mid]);
        node.left = sortedArrayToBST(a,start,mid-1);
        node.right = sortedArrayToBST(a,mid+1,end);
        return node;
    }

    static void preOrder(Node node){
         if(node == null){
             return;
         }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String...args){
        int[] a = {1,2,3,4,5,6,7};
        root = sortedArrayToBST(a,0,a.length-1);
        preOrder(root);
    }

}
