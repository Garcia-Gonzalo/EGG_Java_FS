
public class primesRecursion {
    public static int isPrime(int n) {
        //Base case
        if (n > 1) {
            if (n % (n-1) == 0) return 0;
            else isPrime((n-1));
        }
        return 1;
    }

    public static void main(String[] args) {
        /*System.out.println(isPrime(11));
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(18));
        */
        
    }    
}
