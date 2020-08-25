import java.util.Arrays;

public class primeNo {
    public static void main(String[] args) {
        boolean prime[]=primeNum(1000);
        for (int i=0;i<=1000;i++) {
            if(prime[i])
             System.out.println(i);
        }  
    }          
/* This function can be used to find out the prime numbers efficiently */

  static boolean[] primeNum(int n)
{
    boolean store[]=new boolean[n+1];

    Arrays.fill(store, true);

    store[0]=false;
    store[1]=false;

    for (int  i = 2; i*i <= n; i++)
    {
        for (int j=2*i; j <=n; j+=i)
        {
            store[j]=false;
            
        }
    }
    return store;  
}
}
    