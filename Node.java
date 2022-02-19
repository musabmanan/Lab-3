public class Node<T> {

    private T value;
    private Node<T> next;

    public Node(T value) {
    }


    public void setValue (T value) {
        this.value = value;
    }

    public  T getValue(){

        return this.value;
    }
    public Node<T> getNext(){

        return this.next;
    }
    public boolean hasNext(){

        return this.next != null;
    }
    public void setNext(Node<T> next){

        this.next = next;
    }

}


