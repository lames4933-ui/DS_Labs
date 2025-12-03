package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5};
        Arrays2 arr=new Arrays2();
      /*  int[]numbers2=new int[5];
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

       // for(int i=0;i<numbers.length;i++)
       // System.out.println("index["+i+"]="+numbers[i]);

        Arrays arr=new Arrays();
        arr.Traversal(numbers2);
        arr.Traversal2(numbers);
        arr.ReverseTraversal(numbers);

       // numbers2[0]=1;

        //Scanner scanner=new Scanner(System.in);
        //System.out.println("enter "+numbers2.length+"numbers:");
        //for (int i = 0; i < numbers2.length; i++)
        //numbers2[i]=scanner.nextInt();
        arr.Input(numbers2);


        arr.Updata(numbers,index:2,nvalue:3);
        arr.Delete(numbers,index:2);
        arr.ShiftLeft_Delete(numbers,index:2);
        arr.Shiftright_Delete(numbers,index:2);

        int result= arr.LinearSearch(numbers,svalue:4);
        if (result!=-1)
            System.out.println("V F A I"+result);
        else
            System.out.println("V N F");*/

        int result2= arr.BinarySearch(numbers,0,numbers.length-1,4);
        if (result2!=-1)
            System.out.println("V F "+result2);
        else
            System.out.println("V N F ");


    }

}

