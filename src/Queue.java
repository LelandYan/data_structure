public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E getFront();
    E dequeue();
}
