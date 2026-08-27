public class CGM {
    
    /*
    Problem Statement

The method computeMultiplesSum(n) should return the sum of all positive multiples of 3, 5, or 7 that are strictly below n.

Example:

For n = 12, the positive multiples are:

3, 5, 6, 7, 9, 10

Their sum is:

3 + 5 + 6 + 7 + 9 + 10 = 40

Although 12 is a multiple of 3, it is not included because we consider only numbers strictly below n.

Requirements
Implement computeMultiplesSum(n).
Consider positive integers that are divisible by 3 OR 5 OR 7.
Do not include n itself.
Return the total sum.
Constraint

0 ≤ n < 1000

Input: n
Output: Sum of all positive multiples of 3, 5, or 7 strictly less than n.

Example:
n = 12 → Output: 40
     */


    public static int computeMultiplesSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12;
        int result = computeMultiplesSum(n);
        System.out.println("The sum of all positive multiples of 3, 5, or 7 strictly below " + n + " is: " + result);

    }
}
