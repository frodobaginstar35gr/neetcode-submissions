class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create hashmap 
        // loop 
        // creat n for number var
        // create complement var = target - n
        // check if map .containskey(complement)
        // yes return new array return new int[] {mat.get(complement), i}
        // no map.put(n, i);
        // fail check return new int[0];

        // study dish one tomorrow....

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int n = nums[i];
            int complement = target - n; 
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(n, i);
        }
        return new int[0];
    }
}
