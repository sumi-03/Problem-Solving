import java.util.Stack;

class Solution {
    
    public int[] solution(int[] prices) {
        
        Stack<Integer> s = new Stack<>();
        int n = prices.length;
        int answer[] = new int[n];
   
        s.push(0);
  
        for(int i=1;i<n;i++){
            
            while(!s.isEmpty() && prices[s.peek()]>prices[i]){
                int j = s.pop();
                answer[j] = i-j;
            }
            
            s.push(i);
        }
        
        while(!s.isEmpty()){
            
            int j = s.pop();
            answer[j] = n-j-1;
        }
        
        return answer;
    }
}