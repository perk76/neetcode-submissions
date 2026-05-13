class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character,Character> pairs = new HashMap<Character,Character>();
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('}','{');

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(!stack.isEmpty() && pairs.get(c) == stack.peek()){
                System.out.println("peek "+stack.peek());
                stack.pop();
            }else return false;
            } else {
                stack.push(c);
                System.out.println("push "+c);
            }
        }         
        return stack.isEmpty();
    }
}
