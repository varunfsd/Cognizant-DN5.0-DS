package DeepSkilling;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head, tail;
    int size = 0;

    void addNode(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        System.out.println(list.size);
    }
}
