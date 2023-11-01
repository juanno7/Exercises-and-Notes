package org.example;

public class Main {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        ListNode reversedList = listNode.reverseLinkedList(list1);
        String linkedListAsString = printLinkedList(reversedList);
        System.out.println(linkedListAsString);

// Expected output: 4 -> 3 -> 2 -> 1

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(7);
    }
    public static ListNode listNode = new ListNode();


    public static String printLinkedList(ListNode head){
        StringBuilder sb = new StringBuilder();

        ListNode current = head;
        while(current != null){
            sb.append(current.val);
            if(current.next != null){
                sb.append(", ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}