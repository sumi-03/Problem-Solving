import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0; // 걸린 시간
        int complete = 0; // 다리를 다 건넌 트럭의 수
        int j = 0; // 트럭의 인덱스
        int time[] = new int[truck_weights.length]; // 트럭이 다리를 다 건넜을 때의 시간 저장
        int k = 0; // 트럭이 다리를 다 건넜을 때의 시간 체크를 위한 트럭의 인덱스
        int l = 0; // 먼저 들어간 트럭 중 하나가 다리를 다 건넌 경우 체크를 위한 인덱스
        int onBridge = 0; // 다리 위에 올라온 트럭 무게 총합
        Queue<Integer> q = new LinkedList<>(); // 다리 위에 올라온 트럭이 담긴 큐

        while (true) {

            if (complete == truck_weights.length) {
                break;
            }

            answer++;

            // 먼저 들어간 트럭 중 하나가 다리를 다 건넌 경우
            if (time[l] == answer) {

                onBridge -= q.poll();
                l++;
                complete++;
            }

            // 다리 위에 트럭을 올릴 수 있으면
            if (j < truck_weights.length && (onBridge + truck_weights[j] <= weight)) {

                q.offer(truck_weights[j]);
                onBridge += truck_weights[j++];

                // 현재 트럭이 다리를 다 건널 때의 시간 계산 및 저장
                time[k++] = answer + bridge_length;

            }
        }

        return answer;
    }
}