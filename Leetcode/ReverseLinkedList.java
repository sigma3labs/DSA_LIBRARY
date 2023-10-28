class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;  
}
public static void main(String[] args) {
    // Create the input linked list: head = [1,2,3,4,5]
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    // Call the reverseList method to reverse the linked list
    ReverseLinkedList solution = new ReverseLinkedList();
    ListNode reversedHead = solution.reverseList(head);

    // Print the reversed linked list
    while (reversedHead != null) {
        System.out.print(reversedHead.val + " ");
        reversedHead = reversedHead.next;
    }
}
}

