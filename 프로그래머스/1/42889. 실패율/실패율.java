import java.util.*;

class Solution {
    
    public int[] solution(int N, int[] stages) {
        
        int array[][] = new int[N][2];
        double rate[] = new double[N];
        double clone[];
        int answer[] = new int[N];
        int k = 0;
        HashSet<Double> h = new HashSet<>();
        double temp[];
        int index = 0;
        
        
        for(int i=0;i<N;i++){
            
            for(int j=0;j<stages.length;j++){
                 
                if(stages[j]==i+1){
                    
                    array[i][0]++;
                }
                if(stages[j]>=i+1){
                    
                    array[i][1]++;
                }
            }
        }
        
        for(int i=0;i<N;i++){
            
            if(array[i][1]==0){
                
                rate[i]=0;
            }
            else{

                rate[i] = (double)array[i][0]/(double)array[i][1];
            }
        }
       
        for(double i : rate){
            
            h.add(i);
        }
        
        temp = new double[h.size()];
        
        for(double i : h){
            
            temp[index++] = i;
        }
        
        Arrays.sort(temp);
        
        for(int i=temp.length-1;i>=0;i--){

            for(int j=0;j<rate.length;j++){
                
                if(temp[i]==rate[j]){
                    
                    answer[k++]=j+1;
                }
            }
        }
        
        return answer;
    }
}