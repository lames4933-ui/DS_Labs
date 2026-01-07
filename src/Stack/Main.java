package Stack;

public class Main {
    public static void main(String[] args){
        LinkedStack<Integer>lStack=new LinkedStack<Integer>();
        DoublyStack<Integer>dStack=new DoublyStack<Integer>();
        ArrayStack<Integer> aStack=new ArrayStack<Integer>(5);
        aStack.push(10);
        aStack.push(20);
        aStack.push(30);
        aStack.push(30);
        aStack.push(40);
        aStack.push(50);
        aStack.push(60);
        System.out.println("the top is="+aStack.top());

        aStack.display();

        //while (!lStack.isEmpty()){
          //  System.out.println("element removed:"+lStack.pop());
       // }
    }
}
