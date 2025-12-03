package Arrays;

import java.util.Scanner;

public class Arrays2 {
    Scanner scanner=new Scanner(System.in);

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
    public int LinearSearch(int[]a,int svalue){
        for (int i=0;i<a.length;i++){
            if (svalue==a[i])
                return i;
        }

        return -1;

    }
    public int BinarySearch(int[]a,int findex,int lindex,int svalue){
        for (int i=0;i<a.length;i++){
            if (svalue==a[i])
                return i;
        }
            while (findex<=lindex){
                int mid=(findex+lindex)/2;
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
