class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (countS.containsKey(c)) {
                countS.put(c, countS.get(c) + 1);
            } else {
                countS.put(c, 1);
            }
        }

         for (char c : t.toCharArray()) {
            if (countT.containsKey(c)) {
                countT.put(c, countT.get(c) + 1);
            } else {
                countT.put(c, 1);
            }
        }

        return countS.equals(countT);
    }
}
