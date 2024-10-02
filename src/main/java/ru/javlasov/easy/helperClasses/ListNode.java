package ru.javlasov.easy.helperClasses;


public class ListNode {

    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return val + (next == null ? "" : ", " + next);
    }
}
