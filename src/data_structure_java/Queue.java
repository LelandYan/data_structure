package data_structure_java;

public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E getFront();
    E dequeue();
}
