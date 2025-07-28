class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        // int size = 0;
        // for (char ch : s.toCharArray()) {
        //     if (ch == '(') {
        //         stack.push(ch);
        //         size++;
        //     } else {
        //         if (!stack.isEmpty()) {
        //             stack.pop();
        //             size--;
        //         } else {
        //             size++;
        //         }
        //     }
        // }

        // return size;

        for (char ch : s.toCharArray()) {
            if(ch == ')'){
              if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
        
            }
                else{
                    stack.push(ch);
                }
        }
            
    return stack.size();
}}