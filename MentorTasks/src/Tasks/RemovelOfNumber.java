package Tasks;

import java.util.Arrays;

public class RemovelOfNumber {
    public void remove(int i,String[] arr){
        //Printing elemnts of array
        for(String x:arr){
            System.out.println(x);
        }

        String s=String.valueOf(i);

        String result[]=Arrays.stream(arr)
                .filter(x -> ! x.contains(s))
                .toArray(String[]::new);

        System.out.println("After removing elements:");
        for(String c:result){
            System.out.println(c);
        }

    }
}
