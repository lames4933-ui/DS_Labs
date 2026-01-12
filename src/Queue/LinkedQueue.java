package Queue;

import SinglyLinkedList.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E>{
    SinglyLinkedList<E> slist=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return slist.is_Empty();
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void enqueue(E data) {
        slist.addLast(data);
    }

    @Override
    public E dequeue() {
        return slist.removeFirst();
    }

    @Override
    public E front() {
        return slist.getFirst();
    }
    public void display(){
        slist.display2();
    }
}
