import java.util.HashSet;

class Solution {
    
    HashSet<Integer> h = new HashSet<>();

    public int solution(int[] nums) {

        for(int i=0;i<nums.length;i++){

            h.add(nums[i]);
        }

        int answer = Math.min(nums.length / 2, h.size());
        return answer;
    }
}