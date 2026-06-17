class Solution {
    public boolean isAnagram(String s, String t) {
        // create 2 hash maps 
        // for loop
        // process string and chop into chars 
        // add chars to corresponing hash maps
        // loop ends
        // compare both hash maps this returns true or false

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return countS.equals(countT);

    }
}
