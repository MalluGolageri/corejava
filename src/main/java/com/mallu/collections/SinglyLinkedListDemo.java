package com.mallu.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by golagem on 10/24/17.
 */

class Node {
    public int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyLinkedListDemo {
    Node head;

    public static void main(String[] args) {

//
//        List<Integer> list=new ArrayList<>();
//        list.add(20);
//        list.add(30);
//        list.add(0,40);
//        list.forEach(System.out::println);


        SinglyLinkedListDemo listDemo = new SinglyLinkedListDemo();
        Node node1 = new Node(100);
        listDemo.head = node1;
        Node node2 = new Node(100);
        Node node3 = new Node(100);
        Node node4 = new Node(103);
        Node node5 = new Node(104);
        Node node6 = new Node(103);
        Node node7 = new Node(106);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        printLinkedList(listDemo.head);

        System.out.println("Removing duplicates");
        removeDuplicates(listDemo.head);

        System.out.println("After Reversal");
        reverseLinkedList(listDemo.head);
    }

    private static void removeDuplicates(Node head) {
        Node ptr1 = head, ptr2;
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
            while (ptr2.next != null) {
                if (ptr1.data == ptr2.next.data)
                    ptr2.next = ptr2.next.next;
                else //tricky
                    ptr2 = ptr2.next;
            }
            ptr1 = ptr1.next;
        }
        printLinkedList(head);
    }

    private static void reverseLinkedList(Node head) {
        Node pred = null;
        Node curr = head;
        Node succ = null;
        while (curr != null) {
            succ = curr.next;
            curr.next = pred;
            pred = curr;
            curr = succ;
        }
        printLinkedList(pred);
    }

    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}

