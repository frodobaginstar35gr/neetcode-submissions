class Solution {
    public int removeDuplicates(int[] nums) {
        // set variables
        // while loop check that r < n
        // updating array in place 
        // 2nd while loop checking if r is still
        // in bounds and if ele @ r == ele @ l 
        // if so r ++ if not brake 2nd loop and l++
        // return l; 

        int n = nums.length, l = 0, r = 0;
        while (r < n) {
            nums[l] = nums[r];
            while (r < n && nums[l] == nums[r]) {
                r++;
            }
            l++;
        }
        return l;
    }
}