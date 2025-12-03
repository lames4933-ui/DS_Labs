package Arrays;

import java.util.Scanner;

public class Arrays {
    Scanner scanner=new Scanner(System.in);

    public void Traversal(int[] a) {
        System.out.println("The elements are:");

        for (int i = 0; i < a.length; i++)
            System.out.println("Index[" + i + "]= " + a[i]);

    }

    public void Traversal2(int[] a) {
        System.out.println("The elements are:");

        for (int e:a)
            System.out.println(e);

    }

    public void ReverseTraversal(int[] a) {
        System.out.println("The elements are:");

        for (int i =a.length-1; i >=0; i--)
            System.out.println("Index[" + i + "]= " + a[i]);

    }
    public void Input(int[] a) {
        System.out.println("enter " + a.length + "numbers:");
        for (int i = 0; i < a.length; i++)
        a[i] = scanner.nextInt();
    }
}