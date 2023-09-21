package Data_Structure_Series;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class LInkedListStack {

    Node head;

    class Node {
        int value;
        Node next;
    }

    LInkedListStack() {
        head = null;
    }

    public void push(int value) {
        Node extraHead = head;
        head = new Node();
        head.value = value;
        head.next = extraHead;
    }

    public int pop() {
        if(head == null) {
            System.out.println("Stack is Empty!");
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public static void printAllList(Node head) {
//        Node temp = head;
        while (head!=null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        LInkedListStack lls1 = new LInkedListStack();
        //System.out.println(lls1.pop());

        lls1.push(10);
        lls1.push(30);
        lls1.push(50);
        lls1.push(70);
        lls1.push(90);

        System.out.println("Element removed or Popped from Stack : " + lls1.pop());
        System.out.println("Element removed or Popped from Stack : " + lls1.pop());

        lls1.push(110);
        lls1.push(130);
        lls1.push(10);
        lls1.push(10);
        lls1.push(10);
        System.out.println("Element removed or Popped from Stack : " + lls1.pop());
        System.out.println("Element removed or Popped from Stack : " + lls1.pop());

        printAllList(lls1.head);
    }
}