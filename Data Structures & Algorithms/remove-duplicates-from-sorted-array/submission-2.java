class Solution {
    public int removeDuplicates(int[] nums) {
        // int array nums sorted ascedning 
        // remove dupicates in place from nums
        // k = unique elements that appear only 1
        // return k

        int n = nums.length, l = 0, r = 0;

        while (r < n) {
            nums[l] = nums[r];
            while (r < n && nums[r] == nums[l]) {
                r++;
            }
            l++;
        }
        return l;
    }
}