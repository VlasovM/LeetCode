package ru.javlasov.utills;

public class ListNode {

    private int val;
    private ListNode next;
    private ListNode random;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val, ListNode random, ListNode next) {
        this.val = val;
        this.next = next;
        this.random = random;
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

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getRandom() {
        return random;
    }

    public void setRandom(ListNode random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}


