package Pertemuan4.Tugas;

public class StrukturListTest_B {
    public static void main(String[] args) {
        StrukturList listB= new StrukturList(); // Membuat list baru
        listB.addHead(3.4);//awal
        listB.addTail(4.5);
        listB.addTail(5.5);
        listB.addMid(2.1, 2);
        listB.addMid(1.1, 3);
        System.out.println("list B: ");
        listB.displayElement();
    }
}
