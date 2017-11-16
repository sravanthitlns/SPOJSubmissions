package nextpalindrome;

import java.io.*;
import java.util.*;

/*
Input
The first line contains integer t, the number of test cases. Integers K are given in the next t lines.

Output
For each K, output the smallest palindrome larger than K.

Example
Input:
2
808
2133

Output:
818
2222

Core logic is to compare the left most and right most digit in each iteration. 
Determine the value to be added to make the right most digit same as left most digit. 
Add and iterate. 

Time complexity: O(n) 
Space complexity: O(nXn)

 */
public class NextPalindrome {

    public static void main(String[] args) throws IOException {

        int testCases, palindromeNumber;
        StringBuilder sb;
        
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        String inputs[] = new String[testCases];
        
        for (int i = 0; i < testCases; i++) {
            inputs[i] = String.valueOf(sc.nextInt());
        }
        for (int i = 0; i < testCases; i++) {

            palindromeNumber = Integer.parseInt(inputs[i]);
            do {
                sb = new StringBuilder();
                palindromeNumber = palindromeNumber + 1;

                sb.append(palindromeNumber);
                sb = sb.reverse();

                if (Integer.parseInt(sb.toString()) == palindromeNumber) {
                    System.out.println(palindromeNumber);
                    break;
                }
            } while (palindromeNumber >= 1);

        }

    }

}



