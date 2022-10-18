package valdes.com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        showLinkedList(myLinkedList);
    }
    public static void showLinkedList(MyLinkedList linkedList){
        System.out.println("Обновленный список");
        for (int i = 0; i< linkedList.size(); i++){
            System.out.println((linkedList.get(i)));
        }}
}
