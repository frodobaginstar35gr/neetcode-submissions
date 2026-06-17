class Solution {
    public boolean isValid(String s) {
        // create empty stack
        // create hashmap with valid closeToOpen brackets
        // loop through string
        // check if stack is not empty and stack peek == closetToOpen(char)
        // stack pop
        // else return false;
        // else stack push 
        // return stack.isEmpty()

        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> closeToOpen = 
        new java.util.HashMap<>();
            closeToOpen.put(')', '(');
            closeToOpen.put(']', '[');
            closeToOpen.put('}', '{');

            for (char c : s.toCharArray()) {
                if (closeToOpen.containsKey(c)) {
                    if (!stack.isEmpty() && stack.peek() ==
                    closeToOpen.get(c)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    stack.push(c);
                }
            }
            return stack.isEmpty();
    }
}
