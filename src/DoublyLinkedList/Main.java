package DoublyLinkedList;

public class Main {

    public static void main(String[] args){

        DoublyLinkedList<String> list=new DoublyLinkedList<String>();

        list.addFirst("lamis");
        list.addFirst("Ahmed");
        list.addFirst("Sara");
        list.addLast("Mohammed");

        list.removeFirst();
        list.removeLast();

        list.display();

    }


}
