public class PrimeNum {
    public static void main(String[] args) {
        int number = 11;
        int ans = isPrime(number);
        if(ans == 0) {
            System.out.println("Not Prime");
        } else{
            System.out.println("Prime");
        }
    }

    static int isPrime(int n) {
        if (n <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // Not a prime number if divisible by any number other than 1 and itself
            }
        }
        return 1; // Number is prime if no divisors were found
    }
}
