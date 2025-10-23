import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class java_exer1 {
    public static void printPrimes(int max) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 2; i <= max; i++) {
            boolean checked = checkPrimes(i);
            if (checked) {
                primes.add(i);
                // System.out.println(i);
            }
        }
        System.out.println(primes);
    }

    public static boolean checkPrimes(int num) {
        if (num == 2 | num == 3) {
            return true;
        }
        if (num % 2 == 0 | num % 3 == 0) {
            return false;
        }
        for (int i = 5; i < Math.sqrt(num); i = i + 6) {
            if (num % i == 0 | num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int computeFibonacci(int n) {
        int num = 0;
        if (n == 0 | n == 1) {
            return n;
        }
        if (n > 1) {
            num = computeFibonacci(n - 1) + computeFibonacci(n - 2);
        }

        return num;
    }

    public static int computeScore(String word) {
        Integer n = 0;
        char[] arr  = word.toUpperCase().toCharArray();
        // System.out.println(word);
        HashMap<Character, Integer> score = new HashMap<Character, Integer>();

        // Add keys and values (Country, City)
        score.put('A', 1);
        score.put('B', 3);
        score.put('C', 3);
        score.put('D', 2);
        score.put('E', 1);
        score.put('F', 4);
        score.put('G', 2);
        score.put('H', 4);
        score.put('I', 1);
        score.put('J', 8);
        score.put('K', 5);
        score.put('L', 1);
        score.put('M', 3);
        score.put('N', 1);
        score.put('O', 1);
        score.put('P', 3);
        score.put('Q', 10);
        score.put('R', 1);
        score.put('S', 1);
        score.put('T', 1);
        score.put('U', 1);
        score.put('V', 4);
        score.put('W', 4);
        score.put('X', 8);
        score.put('Y', 4);
        score.put('Z', 10);
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            n += score.get(arr[i]);
        }

        return n.intValue();
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: 3");
        // String maxNumber = myObj.nextLine();
        // printPrimes(Integer.parseInt(maxNumber));
        printPrimes(3);

        System.out.println("Enter a number: ");
        // String num = myObj.nextLine();
        // System.out.println(computeFibonacci(Integer.parseInt(num)));
        System.out.println(computeFibonacci(7));

        System.out.println("Enter a word: ");
        String word = myObj.nextLine();
        System.out.println(computeScore(word));

    }
}