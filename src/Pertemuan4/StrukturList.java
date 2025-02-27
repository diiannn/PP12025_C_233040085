package Pertemuan4;



public class StrukturList {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Latihan-2 addTail
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Latihan-3 DisplayElement
    public void displayElement() {
        Node current = HEAD;
        System.out.println("Elemen : ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Latihan-5 addHead
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    //Module 3 Latihan-2 addMid
    public void addMid(int data, int position) {
        Node newNode = new Node(data);

        if (isEmpty() || position == 1) { // Jika list kosong atau posisi pertama
            newNode.setNext(HEAD);
            HEAD = newNode;
            return;
        }

        Node curNode = HEAD;
        Node posNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        if (posNode != null) {
            posNode.setNext(newNode);
            newNode.setNext(curNode);
        }
    }
}
