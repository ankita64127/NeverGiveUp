//https://leetcode.com/problems/palindrome-number/
/*Given an integer x, return true if x is palindrome integer.

        An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.



        Example 1:

        Input: x = 121
        Output: true
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        Example 4:

        Input: x = -101
        Output: false*/
public class PalindromeNumber {
    public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    }

    public static  boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int res = 0;
        int temp = x;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res == temp) {
            return true;
        }
        return false;
    }
}
