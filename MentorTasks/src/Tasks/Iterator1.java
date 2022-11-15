package Tasks;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Iterator1 {
    public void even(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = myObj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        int i=0;
        while(i<size){
            arr[i]=myObj.nextInt();
            i++;
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int j: arr){
            ar.add(j);
        }
        Iterator<Integer> it = ar.iterator();


        while(it.hasNext()) {
            int c=it.next();
            if((c)%2==0){
                System.out.println(c);
            }
        }
    }
}
