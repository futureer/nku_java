package tool;
/**
 * author: Future
 * print primer numbers from 2 to 100, each line has 5 numbers.
 * 
 */
import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		int start = 2, end = 20;
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			if (isPrime(i))
				primes.add(i);
		}
		
		for (int j = 0; j < primes.size(); j++) {
			System.out.printf("%3d ",primes.get(j));
			if ((j+1)%5==0)
				System.out.println();
		}
	}

	private static boolean isPrime(int num) {
		if (num == 2)
			return true;
		double root = Math.sqrt(num);
		for (int i = 2; i <= root; i++)
			if (num % i == 0)
				return false;
		return true;
	}
}
