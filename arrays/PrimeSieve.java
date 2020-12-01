/* Modified. Now prints out the prime numbers, too.

 */

public class PrimeSieve {
    public static void main(String[] args) { // Print the number of primes <= n.
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;

        for (int i = 2; i <= n / i; i++) {
            if (isPrime[i]) { // Mark multiples of i as nonprime.
                for (int j = i; j <= n / i; j++) {
                    isPrime[i * j] = false;


                }
            }


        }

// Count the primes.
        int primes = 0;
        for (int i = 2; i <= n; i++)
            if (isPrime[i]) {
                System.out.print(i + " "); //prints out the primes
                primes++;
            }
        System.out.println("\nThere are " + primes + " prime numbers.");
    }
}
