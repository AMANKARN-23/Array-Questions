package LeetCode;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 3, 2};
        int result = singleNumber(nums);
        System.out.println("Single Element: " + result);
    }

    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}