import LinkedList.LL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            LL list = new LL();
            list.insertAtFirst(1);
            list.insertLast(4);
            list.insertLast(5);
            list.insert(2,1);
            list.insert(3,2);
            list.display();
            //list.deleteMiddle(3);
    }
}
