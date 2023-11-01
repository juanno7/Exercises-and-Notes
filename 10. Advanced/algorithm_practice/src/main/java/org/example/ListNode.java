package org.example;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(){

    }

    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
