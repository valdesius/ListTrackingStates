package valdes.com.company;

public class MyLinkedList<T> {
    private final HandlerOfElements handlerOfElements = new HandlerOfElements();

    private class Node {
        public T value;
        public Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this(value, null);
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public int size() {
        return size;
    }


    public void addFirst(T value) {
        head = new Node(value, head);

        if (size == 0) {
            tail = head;
        }
        size++;

        handlerOfElements.onAdding(value);
    }

    public void addLast(T value) {
        if (size == 0) {
            head = tail = new Node(value);
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }

        size++;
        handlerOfElements.onAdding(value);

    }

    public void set(int index, T value) {
        Node neww = getNode(index - 1);
        T oldVal = neww.value;
        neww.value = value;
        handlerOfElements.onReplacing(oldVal, neww.value);
    }

    private Node getNode(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }


    public T get(int index) {
        handlerOfElements.onGetting(getNode(index).value);
        return getNode(index).value;

    }

    public void remove(int index) {
        Node current = head;

        if (current == null || current.next == null) {
            throw new NullPointerException();
        }

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
        } else
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

        if (current != null) {
            current.next = current.next.next;
        }

        size--;
        handlerOfElements.onRemoving(current.value);
    }

}
