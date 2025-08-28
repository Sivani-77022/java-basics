public class PrimeNumbers {
    public static void main(String[] args) {
        String primes = ""; // to store prime numbers as a string

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // check prime
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // if prime, add to string
            if (isPrime) {
                primes = primes + num + " ";
            }
        }

        // print all primes as one string
        System.out.println("Prime numbers from 1 to 100:");
        System.out.println(primes.trim());
    }
}