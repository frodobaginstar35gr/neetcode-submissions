class Solution {
    public int[] getConcatenation(int[] nums) {
        // length of nums is n 
        // create array ans of length 2*n
        // ans will be the concatenation of 2 nums
        // return ans

        int[] ans = new int[nums.length * 2];

        // 1, 2, 3, 4, 
        // 

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        } 
        

        return ans;

        
    }
}