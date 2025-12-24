package CircularLinkedList;

public class Main {

    public static void main(String[] args){

        CircularLinkedList<String> list=new CircularLinkedList();

        list.addFirst("lamis");
        list.addFirst("Ahmed");
        list.addFirst("Sara");
        list.addLast("Mohammed");

        list.removeLast();
        list.removeFirst();
        list.display();

    }


}
