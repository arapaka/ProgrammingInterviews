package com.gaylelaakman;

import java.util.HashMap;

/**
 * Created by archithrapaka on 9/14/16.
 */
public class LinkedLists {
   private Node head;
    private Node tail;
    private int size;

    public Node getTail() {
          if(head == null){
              throw new UnsupportedOperationException("The list is empty");
          }
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        tail = temp;
        return tail;
    }

    public void setTail(Node tail) {
           if(getTail() == null){
               this.tail = tail;
               tail.next = null;
           }

         Node oldTail = getTail();
        oldTail.next = tail;
        tail.next = null;
    }

    // add a node
    public void add(int data){
         if(head == null){
             head = new Node(data);
             tail = head;
         } else {
             Node temp = getTail();
             temp.setNext(new Node(data));
         }
        size++;
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.getData() + "-->");
            temp = temp.next;
        }
    }


    // public create loop , joins tail and head node
    public void createLoop(){
          if(tail != null){
              tail.setNext(getHead());
          }
    }

    // my way , requires extra space ..
    public boolean detectLoop(){
        HashMap<Node,Node> map = new HashMap<Node,Node>();
        Node temp = getHead();

        while (temp != null){
                   if(temp.next != null && map.containsKey(temp.next)) {
                       System.out.print("the loop begins at Node :" + temp.next.getData());
                       return true;
                   }
             map.put(temp,temp.next);
            temp = temp.next;
        }
        return false;
    }

    // No extra space...Hare and tortoise algo
    public Node detectAndEndLoop2(){
        Node fast = head;
        Node slow = head;

        //
        while (fast != null && fast.next!= null){
               fast = fast.next.next;
               slow = slow.next;
                     if(slow == fast){  // collision
                         break;
                     }
        }

        // no loop
        if (fast == null || fast.next == null){
            return null;
        }

        slow = head;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        // both now point to start of loop , we need to end the loop

        //slow = slow.next; // advance slow pointer to one place , fast remains at meeting point

        while (slow.next != fast){
            slow = slow.next;
        }
        // grab that prev pointer to start of loop and set it to null

        setTail(slow);
        System.out.println("inside the loop detection:slo.next is:" + slow.next.getData());
       // setTail(slow.next);
        return fast;    // the place where the loop started
    }

    // intersection between two linked lists
    public boolean getIntersectionOfTwoLists(LinkedLists head1 , LinkedLists head2){

             if(head1 == null || head2 == null){
                 return false;
             }
           int sizeDiff = Math.abs(head1.getSize() - head2.getSize());
           Node temp = head1.getSize() > head2.getSize() ? head1.getHead() : head2.getHead();

        // traverse through the longer list for difference of lengths between two lists
           while (temp != null && sizeDiff >= 0){
                 temp = temp.next;
                 sizeDiff--;
           }

           Node shorter = head1.getSize() < head2.getSize() ? head1.getHead() : head2.getHead();

           while (shorter != null && temp != null){
                                if(shorter == temp) {
                                    System.out.println("they are intersecting at :" + shorter.getData());
                                    return true;
                                }
                shorter = shorter.next;
                temp = temp.next;
           }
        return false;
    }

    // check if linkedlist is palindrome ..
     public boolean isPalindrome(Node head){
         Node reverse = reverseList(head);
         return isEqual(reverse , head);
     }


    // reverse a list
    public Node reverseList(Node rootNode){
        Node newHead = null;
        while (rootNode != null){
            Node temp = new Node(rootNode.data);
            temp.next = newHead;
            newHead = temp;
            rootNode = rootNode.next;
        }
        return newHead;
    }

    // compare two lists given their root nodes

    public boolean isEqual(Node rootA , Node rootB){
           if((rootA == null && rootB != null)|| (rootB == null && rootA != null)){
               return false;
           }
        while (rootA != null && rootB != null) {
                        if (rootA.getData() != rootB.getData()){
                            return false;
                        }
            rootA = rootA.next;
            rootB = rootB.next;
        }
        return true;
    }

    // remove duplicates from sorted LinkedList
     public Node removeDuplicates(Node rootHead) {
            Node curr = rootHead;

         while (curr.next != null) {
                      if(curr.data == curr.next.data){
                            curr.next = curr.next.next;
                      }
             curr = curr.next;
         }
         return rootHead;
     }

    // sort a linked list

//    public Node sort(Node root){
//         if(root == null){
//             return null;
//         }
//
//    }

    private class Node {
              int data;
              Node next = null;
              public Node(int data){
                  this.data = data;
              }

              public int getData() {
                  return data;
              }

              public void setData(int data) {
                  this.data = data;
              }

              public Node getNext() {
                  return next;
              }

              public void setNext(Node next) {
                  this.next = next;
              }
          }

    public static void main(String ...args){
        LinkedLists list = new LinkedLists();
        //list.add(6);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        //System.out.println("creating a loop ");
        //list.createLoop();
        //list.printList();
        //System.out.println(list.getSize());
        //Node k = list.detectAndEndLoop2();
        //System.out.println(list.getTail().data);
        //list.printList();
        //System.out.println(k.getData());
       //Node rev = list.reverseList(list.getHead());

        Node rev = list.removeDuplicates(list.getHead());
        while (rev != null){
            System.out.println(rev.getData());
            rev = rev.next;
        }



    }
}
