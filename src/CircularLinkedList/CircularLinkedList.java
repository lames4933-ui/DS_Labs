package CircularLinkedList;


public class CircularLinkedList<E> {

    private Node<E> tail;
    private int size ;

    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public CircularLinkedList(){
        tail=null;
        size=0;
    }
    public int size() {
        return size;

    }

    public boolean is_Empty() {

        return size() == 0;
    }

public void addFirst(E data){
        if (is_Empty()){
            Node<E> newNode=new Node(data,null);
            tail=newNode;
            newNode.setNext(tail);
        }
        else {
            Node<E> newNode =new Node(data,tail.getNext());
            tail.setNext(newNode);
        }
        size++;
}
public void addLast(E data){
        addFirst(data);
        tail=tail.getNext();
}

    public E getFirst(){return tail.getNext().getData();}
    public E getLast(){return tail.getData();}

    public E removeFirst(){
    if (is_Empty())return null;
    E delete=tail.getNext().getData();
    if (tail==tail.getNext()){
        tail=null;
    }
    else {
        tail.setNext(tail.getNext().getNext());
    }
    size--;
    return delete;
}


    public E removeLast(){
        if (is_Empty())return null;
        E delete=tail.getData();
        if (tail==tail.getNext()){
            tail=null;
        }
        else {
            Node<E> temp = tail.getNext();
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            temp.setNext(tail.getNext());
            tail = temp;
        }
        size--;
        return delete;
    }


    public void display(){


        Node<E> temp = tail.getNext();
        do{
            System.out.print(temp.getData() + "------>");
            temp=temp.getNext();
        }
        while (temp != tail.getNext());

        System.out.println(" Go first("+temp.getData()+")");
    }




}


