class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[slow];
        while (slow != fast) {
            fast = nums[nums[fast]];
            slow = nums[slow];
        }

        fast = nums[0];
        slow = nums[slow];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

//Fast and slow pointer to find where to start searching