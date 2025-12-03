/*package Arrays;

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
}*/
package Arrays;

import java.util.Scanner;

public class Arrays2 {
   /* Scanner scanner=new Scanner(System.in);

    public void Input(int[]a){
        System.out.println("enter:"+a.length+"number");

        for (int i=0;i<a.length;i++)
            a[i]=scanner.nextInt();
    }

    public void Updata(int[]a,int index,int nvalue){

        if(index <0 || index >=a.length)
            System.out.println("x");
        else
            a[index]=nvalue;

    }
    public void Delete(int[]a,int index){

        if(index <0 || index >=a.length)
            System.out.println("x");
        else
            a[index]=0;

    }
    public void ShiftLeft_Delete(int[]a,int index){

        for (int i=index;i<a.length-1;i++) {
            a[i] = a[i + 1];
        }
        a[a.length-1]=Integer.MIN_VALUE;
    }
    public void Shiftright_Delete(int[]a,int index){

        for (int i =a.length-1; i >=0; i--)
        {
            a[i] = a[i - 1];
        }
        a[0]=Integer.MIN_VALUE;
    }
    public int LinearSearch(int[]a,int svalue){
        for (int i=0;i<a.length;i++){
            if (svalue==a[i])
                return i;
        }

        return -1;

    }*/
    public int BinarySearch(int[]a,int findex,int lindex,int svalue) {

            while (findex<=lindex){
                int mid=(findex+lindex)/2;
                 System.out.println("mid"+mid);
                if (svalue==a[mid])
                    return mid;
                if (svalue> a[mid])
                    findex=mid+1;
                if (svalue< a[mid])
                    lindex=mid-1;
            }
        return -1;

    }

}
