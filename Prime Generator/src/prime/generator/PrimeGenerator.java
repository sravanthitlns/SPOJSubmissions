/*
Input
The input begins with the number t of test cases in a single line (t<=10). In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

Output
For every test case print all prime numbers p such that m <= p <= n, one number per line, test cases separated by an empty line.

Example
Input:
2
1 10
3 5

Output:
2
3
5
7

3
5
 */
package prime.generator;

import java.util.*;

public class PrimeGenerator {

    public static boolean isPrime(int no) {
        if (no == 1) {
            return false;
        }
        int y = (int) Math.sqrt(no);
        for (int j = 2; j <= y; j++) {
            if (no % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            for (int j = min; j <= max; j++) {
                if (isPrime(j)) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }

}
