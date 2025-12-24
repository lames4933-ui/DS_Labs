package DoublyLinkedList;

public class DoublyLinkedList<E> {

    private Node<E> header;
    private Node<E> tailer;
    private int size=0;

    public DoublyLinkedList(){
        header=new Node(null,null,null);
        tailer=new Node(header,null,null);
        header.setNext(tailer);
    }

    public int size() {
        return size;

    }

    public boolean is_Empty() {

        return size() == 0;
    }
    private void addBetween(Node<E>left, E data,Node<E>right){
        Node<E>newNode=new Node(left,data,right);
        left.setNext(newNode);
        right.setNext(newNode);
        size++;
    }
    public void addFirst(E data){
        addBetween(header,data,header.getNext());
    }
    public void addLast(E data){
        addBetween(tailer.getPrev(),data,tailer);
    }
    public E getFirst(){
        if (is_Empty())return null;
        return header.getNext().getData();
    }
    public E getLast(){
        if (is_Empty())return null;
        return tailer.getPrev().getData();
    }

     class Node<E>{
         private Node<E> prev;

         private E data;

         private Node<E> next;


         public Node(Node<E> prev, E data, Node<E> next) {
             this.prev = prev;
             this.data = data;
             this.next = next;
         }

         public Node<E> getPrev() {
             return prev;
         }

         public E getData() {
             return data;
         }

         public Node<E> getNext() {
             return next;
         }

         public void setPrev(Node<E> prev) {
             this.prev = prev;
         }

         public void setData(E data) {
             this.data = data;
         }

         public void setNext(Node<E> next) {
             this.next = next;
         }

















     }
}
