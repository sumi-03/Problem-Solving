import java.util.Stack;

class Solution {
    
    Stack<Character> stack = new Stack<>();
        
    boolean solution(String s) {
       
        for(int i=0;i<s.length();i++){
            
            char x = s.charAt(i);
            
            if(x=='('){
                
                stack.push(x);
            }
            else if(x==')'){
                
                if(!stack.isEmpty()){
                    
                    stack.pop();
                }
                else{
                    
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}