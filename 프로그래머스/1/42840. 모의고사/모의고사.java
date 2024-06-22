class Solution {
    
    public int[] solution(int[] answers) {
        
        int p1[] = {1,2,3,4,5};
        int p2[] = {2,1,2,3,2,4,2,5};
        int p3[] = {3,3,1,1,2,2,4,4,5,5};
        
        int check[] = new int[3];
        int j = 0;
        int k = 0;
        int l = 0;
        
        int count = 0;
        int array[];
        int m = 0;
        
        for(int i=0;i<answers.length;i++){
        
            if(answers[i]==p1[j]){
                
                check[0]++;
                j++;
                
                if(j%p1.length==0){
                    
                    j=0;
                }
            }
            else{

                j++;
                
                if(j%p1.length==0){
                    
                    j=0;
                }
            }

            if(answers[i]==p2[k]){
                
                check[1]++;
                k++;
                
                if(k%p2.length==0){
                    
                    k=0;
                }
            }
            else{

                k++;
                
                if(k%p2.length==0){
                    
                    k=0;
                }
            }
            
            if(answers[i]==p3[l]){
            
                check[2]++;
                l++;
                
                if(l%p3.length==0){
                    
                    l=0;
                }
                
            }
            else{

                l++;
                
                if(l%p3.length==0){
                    
                    l=0;
                }
            }
        }
        
        int max = 0;
        
        for(int i=0;i<=2;i++){
            
            if(check[i]>max){

                max = check[i];
            }
        }
        
        for(int i=0;i<=2;i++){

            if(max==check[i]){
                
                count++;
            }
        }
        
        array = new int[count];
        
        for(int i=0;i<=2;i++){

            if(max==check[i]){
                
               array[m++] = i+1;
            }
        }
        
        return array;
    }
}