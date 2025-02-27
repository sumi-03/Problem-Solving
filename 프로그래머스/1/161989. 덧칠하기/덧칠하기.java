class Solution {
    
    public int solution(int n, int m, int[] section) {
    
        int count = 1;
        int i=1;
        int current = section[0];
        
        current+=m;
        
        while(true){
            
            if(i==section.length){
                break;
            }
            
            if(section[i]>=current){
                current = section[i]+m;
                count++;
            }
            else{
                
                i++;
            }
        }
    
        return count;
        
    }

}