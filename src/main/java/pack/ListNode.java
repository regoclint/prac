package pack;

public class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode child;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }

    public ListNode(int val, ListNode prev, ListNode next, ListNode child) {
        this.val = val;
        this.next = next;
        this.prev = prev;
        this.child = child;
    }

    public String toString() {
        return " " + this.val + " ";
    }
}
