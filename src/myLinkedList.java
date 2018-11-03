import java.util.Iterator;

public class myLinkedList<E> implements myList<E> {
    private Node <E>head;
    private Node<E> tail;
    private Node<E> current;
    private int size;

    myLinkedList() {
        tail = new Node(head, null, null);
        head = new Node(null, tail, null);
        current = head.getNext();

    }


    @Override
    public E get(int index) {
        if(index > size -1)
            throw new ArrayIndexOutOfBoundsException();
        int i = 0;
        current = head.getNext();

        while(i<=index) {
            current = current.getNext();
            i++;
        }
            return current.getValue();
    }

    @Override
    public boolean addLast(E e) {
        tail.setNext(new Node(tail.getPrevious(),null,e));
        tail = tail.getNext();
        size++;

        return true;
    }


    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }


}
