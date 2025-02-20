package Pertemuan3;

public class ListTest {
    public static void main(String[] args) {

        System.out.println("----Latihan 4----");
        StrukturList list1 = new StrukturList();
        list1.addTail(3);
        list1.addTail(4);
        list1.addTail(5);
        list1.displayElement();

        System.out.println("----Tes-1A----");
        StrukturList list2 = new StrukturList();
        list1.addTail(3);
        list1.addTail(2);
        list1.addTail(1);
        list1.displayElement(); // Output: 3 2 1

        System.out.println("----Tes-1B----");
        StrukturList list3 = new StrukturList();
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);
        list2.displayElement(); // Output: 1 4 5 7

        System.out.println("----Tes-2----");
        StrukturList list4 = new StrukturList();
        list3.addHead(5);
        list3.addHead(4);
        list3.addHead(3);
        list3.displayElement(); // Output: 3 4 5

        System.out.println("---Tes-3A----");
        StrukturList list5 = new StrukturList();
        list4.addHead(1);
        list4.addHead(2);
        list4.addHead(3);
        list4.displayElement(); // Output: 3 2 1

        System.out.println("---Tes-3B----");
        StrukturList list6 = new StrukturList();
        list5.addHead(7);
        list5.addHead(5);
        list5.addHead(4);
        list5.addHead(1);
        list5.displayElement(); // Output: 1 4 5 7
    }
}