package LeetCode;

public class MajorityElement {
    static int majorityelem(int arr[], int n) {
        int majorityCount = n / 2;
        for (int num : arr) {
            int count = 0;
            for (int elem : arr) {
                if (elem == num) {
                    count += 1;
                }
            }
            if (count > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 1, 1, 2, 2, 2, 2 };
        int n = arr.length;
        int result = majorityelem(arr, n);
        System.out.println("Majority Element: " + result);
    }
}
