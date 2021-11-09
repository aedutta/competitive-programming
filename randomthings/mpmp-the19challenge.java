// the goal of this problem is to essentially find if the sum of the first n squares of primes is divisible by 19. 
// first create a boolean class to check if a number is prime. Then make a primes array and add the number of primes that are within a given range. Then make another for loop to check the given condition. 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class test {
static boolean isPrime(int n) {
if (n <= 1)
   return false;
   
for (int i = 2; i < n; i++) {
   if (n % i == 0) return false;
}
return true;
}

public static void main(String args[]) {
int max = 10000;
int count = 0;
int[] primes = new int[max];
for (int i = 1; i < max; i++) {
   if (isPrime(i) == true) {
   primes[count] = i;
   count++;
   }
}
int sum = 0;
for (int i = 1; i < max; i++) {
sum+= primes[i-1] * primes[i-1];
if (sum%i == 0) System.out.println(i + " ");
}
    }    
  }
