class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create hashmap
        // loop through nums
        // create two vars 
        // compliment = target - n
        // int  num
        // check if hashmap has complement if so 
        // return arr with ineces 

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int n = nums[i];
            int complement = target - n;
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(n, i);
        }
        return new int[0];
    }
}
