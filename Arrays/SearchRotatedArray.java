/*
Problem: Search in Rotated Sorted Array
Platform: LeetCode #33
Difficulty: Medium

Approach:
- Use modified binary search.
- Find which half is sorted.
- Check if the target lies in the sorted half.
- Discard the other half.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {

                // Target lies in left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(nums, target));
    }
}
