package Queue;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> lqueue=new LinkedQueue<String>();
        DoublyQueue<String> dqueue=new DoublyQueue<String>();
        ArrayQueue<String> aqueue=new ArrayQueue<String>();

        aqueue.enqueue("lamis");
        aqueue.enqueue("najib");
        aqueue.enqueue("Mohammed");
        aqueue.enqueue("Almahwiti");

        System.out.println("the front element is = "+aqueue.front());
        aqueue.display();
//        while (!aqueue.isEmpty()){
//            System.out.println("element removed : "+ aqueue.dequeue());
//        }
    }
}
