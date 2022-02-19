public class MyLinkedList<T> {
    private Node<T> head;

    public void add(T value) {



        if (this.head == null) {
            this.head = new Node<>(value);
            return;
        }
        Node<T> current = head;
        while (current.hasNext()) {
            current = current.getNext();
        }
        current.setNext(new Node<>(value));


    }




    public T remove() {

        if (this.head == null)
            return null;

        if (!this.head.hasNext()) {
            T value = this.head.getValue();
            this.head = null;
            return value;
        }


        Node<T> last = head;
        Node<T> second_last = null;
        while (last.hasNext()) {
            second_last = last;
            last = last.getNext();
        }

        second_last.setNext(null);

        return last.getValue();
    }


    public void clear() {

        this.head = null;

    }


    public int size() {
        if (this.head == null) {
            return 0;
        }
        int count = 0;
        Node<T> n = this.head;
        while (n != null) {
            count++;
            n = n.getNext();
        }
        return count;
    }
}


