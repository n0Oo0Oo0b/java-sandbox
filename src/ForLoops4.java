/* English
 1. Initialize num to 2
 2.   Initialize divisor to 1
 3.     Increment divisor
 4.     If divisor is equal to num, go to step 6. Otherwise, proceed
 5.     If num is divisible by divisor, go to step 7. Otherwise, go to step 3
 6. Output num
 7. Increment num
 8. If num is greater than 100, stop. Otherwise, go to step 2
 */

/* Rust
fn main() {
    println!("Sieve method");
    let mut sieve = vec![true; 101];
    for n in 2..=100 {
        if !sieve[n] { continue; }
        println!("{n}");
        for i in (n..=100).step_by(n) {
            sieve[i] = false
        };
    }

    println!("Divisibility check method");
    let mut primes = Vec::new();
    for n in 2..=100 {
        if primes.iter().all(|i| n % i != 0) {
            primes.push(n);
            println!("{n}");
        }
    }
}
 */

public class ForLoops4 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.printf("%d is prime%n", n);
        }
    }
}
