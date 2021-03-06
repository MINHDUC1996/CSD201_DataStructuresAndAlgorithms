package Ex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duclt
 */
public class IntSLLNodeList {

    protected IntSLLNode head, tail;
    protected int count = 0;

    public IntSLLNodeList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int el) {
        head = new IntSLLNode(el, head);
        if (tail == null) {
            tail = head;
        }
        count++;
    }

    public void addToTail(int el) {
        if (!isEmpty()) {
            tail.next = new IntSLLNode(el);
            tail = tail.next;
        } else {
            head = tail = new IntSLLNode(el);
        }

        count++;
    }

    public void printAll() {
        IntSLLNode tmp;
        for (tmp = head; tmp.next != null; tmp = tmp.next) {
            System.out.print(tmp.info + ", ");
        }
        System.out.print(tmp.info);
        System.out.println();
    }

    public int convertInt() {
        String number = "";
        for (IntSLLNode tmp = head; tmp.next != null; tmp = tmp.next) {
            number = tmp.info + number;
        }
        return Integer.parseInt(number);
    }
}
