package leetcode

/**
 * O(N^2) brute force
 */
class TwoSum_1 {
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            for ((index1, v1) in nums.withIndex()) {
                for ((index2, v2) in nums.withIndex()) {
                    if (index1 == index2) continue
                    if (v1 + v2 == target) {
                        return intArrayOf(index1, index2)
                    }
                }
            }
            return intArrayOf()
        }
    }

    /**
     * O(N) [nums]를 순회하며, [target] 과의 차이를 [diffMap]에 저장한다.
     * [diffMap]에서 [diff]를 찾을 수 있다면, 해당 값을 꺼내와 현재 인덱스의 [nums]값과 더하면 [target]이 된다.
     */
    class Solution2 {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val diffMap = hashMapOf<Int, Int>()

            for ((index, value) in nums.withIndex()) {
                val diff = target - value
                if (diffMap.contains(diff)) return intArrayOf(diffMap[diff]!!, index)
                diffMap[nums[index]] = index
            }
            return intArrayOf()
        }
    }
}