package Tasks;
import java.lang.Math;
import java.lang.reflect.Array;

public class randomNumbers {
    private static double[] arr ;
    public void random(int size) {
        arr= new double[size];
        double rand = Math.random();
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }

        //Printing the array
        for (double i : arr){

            System.out.println(i);

        }

        //Finding Min, Max and arithmetical mean.
        double min = arr[0];
        double max=arr[0];
        double sum=0;
        for(double i:arr){
            if(i <min) {
                min = i;
            }
            else{
                max=i;
            }
            sum+=i;
        }
        System.out.println("The minimum value in array is:"+min);
        System.out.println("The maximum value in array is:"+max);
        System.out.println("The arithmetic value in array is:"+sum);
    }
    public double[] sendArray(){
        return arr;
    }
}
