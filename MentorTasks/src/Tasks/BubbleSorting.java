package Tasks;

public class BubbleSorting {
    public void sort() {
        randomNumbers rn = new randomNumbers();
        double[] arr;
        arr = rn.sendArray();

        //Sorting
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping the elements
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    //Printing the sorted array
        for (double i : arr)
        {
        System.out.println(i);
        }

    }

}
