import java.util.ArrayList;
import java.util.Scanner;

public class PrimeConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Long> distinctNumbers = new ArrayList<>();
        long minc = Long.MAX_VALUE;

        while (scanner.hasNext()) {
            long z = scanner.nextLong();
            distinctNumbers.add(z);
            if (z < minc) {
                minc = z;
            }
        }

        long smallestDistinctNumber = distinctNumbers.get(0);
        long smallestValidPrime = findSmallestValidPrime(distinctNumbers, smallestDistinctNumber);

        if (smallestValidPrime != -1) {
            System.out.println(smallestValidPrime);
        } else {
            System.out.println("None");
        }
    }

    public static long findSmallestValidPrime(ArrayList<Long> numbers, long q) {
        long p = q + 1;
        long step = 1;

        while (true) {
            boolean valid = true;
            for (long number : numbers) {
                if (number != q && p % number != q) {
                    valid = false;
                    break;
                }
            }

            if (valid && isPrime(p)) {
                return p;
            }

            p += step;
            step = (step == 1) ? 2 : 1;
        }
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
