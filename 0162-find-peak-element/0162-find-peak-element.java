class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int a = 1, b=nums.length-2;
        while (a<=b) {
            int mid=a+(b-a)/2;
            if (nums[mid]>nums[mid-1] &&
                nums[mid]>nums[mid+1]) {
                return mid;
            }
            else if (nums[mid]>nums[mid - 1]) a=mid+1;
            else b=mid-1;
        }
        return -1;
    }
}