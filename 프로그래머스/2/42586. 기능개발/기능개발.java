import java.util.ArrayList;

class Solution {

    public int[] solution(int[] progresses, int[] speeds) {

        int term[] = new int[progresses.length];
        ArrayList<Integer> list = new ArrayList<>();
        int array[];
        int j = 0;
        int count = 1;
        int maxDay;

        for (int i = 0; i < progresses.length; i++) {

            if ((100 - progresses[i]) % speeds[i] == 0) {

                term[i] = (100 - progresses[i]) / speeds[i];
            } 
            else {

                term[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
        }
        
        maxDay = term[0];
        
        for (int i = 1; i < term.length; i++) {

            if (term[i] <= maxDay) {

                count++;
            } 
            else {

                list.add(count);
                count = 1;
                maxDay = term[i];
            }
        }

        list.add(count);

        array = new int[list.size()];

        for (int i : list) {
            
            array[j++] = i;
        }

        return array;
    }
}