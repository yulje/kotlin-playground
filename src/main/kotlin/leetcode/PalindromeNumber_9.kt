package leetcode

/**
 * constrains -2^31 <= x <= 2^31 - 1
 */
class PalindromeNumber_9 {
    class Solution {
        fun isPalindrome(x: Int): Boolean {
            if (x < 0 || (x != 0 && x % 10 == 0)) return false
            if (x < 10) return true

            //12321
            var left = x //left half of x
            var right = 0 //right half of x
            while (left > right) {
                right = right * 10 + left % 10 //make reversed right half 1, 12 123
                left /= 10 //make left half 1232, 123, 12
            }

            return left == right || left == right / 10
        }
    }
}