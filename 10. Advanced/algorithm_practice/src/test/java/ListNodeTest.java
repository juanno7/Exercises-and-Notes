import org.example.ListNode;
import org.junit.Test;
import org.example.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ListNodeTest {
    @Test
    public void TestReversedLinkedList(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);

        ListNode listNode = new ListNode();
        ListNode reversedList = listNode.reverseLinkedList(list);


        assertEquals(4, reversedList.val);
        assertEquals(3, reversedList.next.val);
        assertEquals(2, reversedList.next.next.val);
        assertEquals(1, reversedList.next.next.next.val);
        assertNull(reversedList.next.next.next.next);
    }
}
