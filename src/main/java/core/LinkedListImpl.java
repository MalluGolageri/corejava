package core;

import java.io.File;
import java.util.*;

/**
 * Created by golagem on 10/14/17.
 */
public class LinkedListImpl {

    public static void main(String[] args) {

        Map hashMap=new HashMap();
        hashMap.put("`a", "A");
        hashMap.put("aB","A");

        System.out.println(hashMap.size());

        hashMap.forEach((o, o2) -> {
            System.out.println(o.toString());
        });

        MyLinkedList myLinkedList=new MyLinkedList();
    }
}

class MyLinkedList {

    Node last;
    Node first;
    int size;

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.add("G");
        //linkedList.add(0,"A");
        //linkedList.add(3,"D");


        System.out.println("first node:"+linkedList.first.data);
        System.out.println("last node:"+linkedList.last.data);
        System.out.println("Nth Node data:"+getNthNode(linkedList.first,3).data);

        for (int i=0;i<linkedList.size;i++)
        System.out.println(linkedList.get(i).data);

        reverse(linkedList);
    }

    private static Node getNthNode(Node head, int n) {
        return --n > 0 ? getNthNode(head.next, n) : head;
    }

    private static void reverse(MyLinkedList linkedList) {

        for (int i=linkedList.size-1;i>=0;i--){
            Node node=linkedList.get(i);
        }
    }

    public void add(Object data) {
        Node l = last;
        Node currentNode = new Node(l, data, null);
        last = currentNode;
        if (l == null) {
            first = currentNode;
        } else {
            l.next = currentNode;
        }
        size++;
    }

    public Node get(int index) {
        //if(index>=size) throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        if(index < (size>>1)){
             Node node=first;
            for (int i=0; i<index;i++){
                node=node.next;
            }
            return node;
        }
        else{
            Node node=last;
            for (int i=(size-1); i> index;i--){
                node=node.prev;
            }
            return node;
        }
    }

    public void add(int index,Object data){
        if(index==size){
            addLast(data);
            return;
        }
        Node succ=get(index);
        Node pred=succ.prev; //null
        Node newNode=new Node(pred,data,succ);
        succ.prev=newNode;
        if(pred==null){
            first=newNode;
        }else{
            pred.next=newNode;
        }
        size++;
    }

    private void addLast(Object data) {
        final Node l = last;
        final Node newNode = new Node(l, data, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }


    static class Node {
        Node prev;
        Node next;
        Object data;

        public Node(Node prev, Object data, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }


}