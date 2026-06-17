class Solution {
    public int removeDuplicates(int[] nums) {
        // use l and r pointers
        // declare l var = 1; 
        // loop through array set r = to 1 
        // if r does not equal l
        // l = r
        // l ++ 
        // finally return l;

        int l = 1;

        for (int r = 1; r < nums.length; r++){
            if (nums[r] != nums[r-1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}