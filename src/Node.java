import java.util.stream.Stream;

public class Node<E> {
    private Node<E> previous;
    private Node<E> next;
    private E value;
     Node(Node previous,Node next, E value){
        this.next = next;
        this.previous = previous;
        this.value= value;
    }


    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    @Override
    public String toString() {
         return value.toString();
    }
}

