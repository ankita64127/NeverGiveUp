// https://leetcode.com/problems/reverse-integer/
/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



        Example 1:

        Input: x = 123
        Output: 321
        Example 2:

        Input: x = -123
        Output: -321
        Example 3:

        Input: x = 120
        Output: 21
        Example 4:

        Input: x = 0
        Output: 0*/
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        ;
    }

    public static int reverse(int x) {
        int temp = 1;
        long res=0;
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE || x==0){
            return 0;
        }
        if (x < 0) {
            temp = -1;
        }
        while (x != 0) {
            res = res*10 + Math.abs(x % 10);
            x = x / 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return  (int)res*temp;
    }
}
