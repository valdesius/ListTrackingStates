package valdes.com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addLast(70);
        myLinkedList.addLast(3);
        myLinkedList.remove(2);
        myLinkedList.get(0);
        myLinkedList.set(0, 90);
    }
}
