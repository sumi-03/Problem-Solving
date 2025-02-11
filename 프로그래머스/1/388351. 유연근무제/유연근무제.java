class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        boolean[] isWeekday = new boolean[7];
        
        for (int i = 0; i < 7; i++) {
            
            int day = (startday + i - 1) % 7 + 1;
            isWeekday[i] = (day >= 1 && day <= 5); 
        }

        for (int i = 0; i < timelogs.length; i++) {
            
            int count = 0;

            int standard = schedules[i] + 10;
            
            if (standard % 100 >= 60) {
                
                standard = (standard / 100 + 1) * 100 + (standard % 100 - 60);
            }

            for (int j = 0; j < 7; j++) {
                
                if (isWeekday[j] && timelogs[i][j] <= standard) {
                    
                    count++;
                }
            }

            if (count >= 5) {
                
                answer++;
            }
        }
        return answer;
    }
}