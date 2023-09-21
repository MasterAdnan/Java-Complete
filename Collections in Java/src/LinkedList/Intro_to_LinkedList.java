package LinkedList;

public class Intro_to_LinkedList {

    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printMyLinkedList() {
//        Node n = head;

        while (head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Intro_to_LinkedList ll = new Intro_to_LinkedList();

        Node first = ll.new Node(10);
        ll.head = first;

        Node second = ll.new Node(20);
        first.next = second;

        Node third = ll.new Node(30);
        second.next = third;

        ll.printMyLinkedList();
        

    }
}