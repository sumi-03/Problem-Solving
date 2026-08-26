class Solution {

    public int[] nums;
    public int targetNum;
    public int answer = 0;

    public int solution(int[] numbers, int target) {
        nums = numbers.clone();
        targetNum = target;

        dfs(0, 0);

        return answer;
    }

    public void dfs(int depth, int value) {
        if (depth == nums.length) {
            if (value == targetNum) {
                answer++;
            }
            return;
        }

        dfs(depth + 1, value + nums[depth]);
        dfs(depth + 1, value - nums[depth]);
    }
}