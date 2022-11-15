package Tasks;

public class PrimeNumber {
    public void prime(int from, int to){
        //sending numbers to verify
        for(int i=from;i<=to;i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

//Method to check for prime
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        int q=0;
        for (int i=1;i<=n;i++){
            if(n%i==0)
                q++;
        }
        if(q>2)
            return false;
        else
            return true;
    }

}
