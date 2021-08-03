package leetcode

import kotlin.math.absoluteValue
import kotlin.math.sign

class ReverseInteger_7 {
    class Solution {
        fun reverse(x: Int): Int {
            var input = x.absoluteValue
            var ret = 0L

            while (input != 0) {
                ret = ret * 10 + input % 10
                input /= 10
            }
            if (ret > Int.MAX_VALUE || ret < Int.MIN_VALUE) return 0
            return if (x.sign > 0) ret.toInt() else -ret.toInt()
        }

        fun reverse2(x: Int): Int {
            return x.sign * (x.absoluteValue.toString().reversed().toIntOrNull() ?: 0)
        }
    }
}