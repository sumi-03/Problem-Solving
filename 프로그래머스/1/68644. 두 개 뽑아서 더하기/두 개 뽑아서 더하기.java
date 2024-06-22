import java.util.*;

class Solution {
    
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> h = new HashSet<>();
        int answer[];
        int index = 0;
        
        for(int i=0;i<numbers.length-1;i++){
            
            for(int j=i+1;j<numbers.length;j++){

                h.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = new int[h.size()];
    
        for(Integer element : h){

            answer[index++] = element;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
