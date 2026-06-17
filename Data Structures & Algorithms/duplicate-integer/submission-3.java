class Solution {
    public boolean hasDuplicate(int[] nums) {
        // iterate through nums, check if n is in nums if so return true,
        // if not let loop finish and return false.

        // create set
        // loop through nums
        // check if n of nums is in set
        // yes return true
        // no add n to seen 
        // loop ends return false; 

        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (seen.contains(n)) {
                return true;
            } else {
                seen.add(n);
            }
        }
        return false; 
    }
}