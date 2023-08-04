package ru.youngstanis.leetcode

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val res = IntArray(nums.size + 1)
        for((i, _) in nums.withIndex()) {
            res[i + 1] = nums[i] + res[i]
        }
        return res.slice(1 until res.size).toIntArray()
    }
}

fun main() {
    val solution = Solution()
    val res1 = solution.runningSum(intArrayOf(1,2,3,4))
    res1.forEach { print("$it ") }
    println()
    val res2 = solution.runningSum(intArrayOf(1,1,1,1,1))
    res2.forEach { print("$it ") }
    println()
    val res3 = solution.runningSum(intArrayOf(3,1,2,10,1))
    res3.forEach { print("$it ") }
}
