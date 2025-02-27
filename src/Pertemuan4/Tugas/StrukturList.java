package Pertemuan4.Tugas;

public class StrukturList {
        private Node HEAD;

        public boolean isEmpty() {
            return HEAD == null;
        }

        public void addHead(double data) {
            Node newNode = new Node(data);
            newNode.setNext(HEAD);
            HEAD = newNode;
        }

        public void addTail(double data) {
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

        public void addMid(double data, int position) {
            Node newNode = new Node(data);
            if (isEmpty() || position == 1) {
                addHead(data);
                return;
            }

            Node curNode = HEAD;
            Node prevNode = null;
            int i = 1;

            while (curNode != null && i < position) {
                prevNode = curNode;
                curNode = curNode.getNext();
                i++;
            }

            if (prevNode != null) {
                prevNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }

        public void displayElement() {
            Node current = HEAD;
            System.out.println("Elemen: ");
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println();
        }
    }

