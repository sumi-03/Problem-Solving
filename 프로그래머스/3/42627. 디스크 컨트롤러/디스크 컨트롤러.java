import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int formerTime = -1;
        int time = 0;
        int finished = 0;

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        PriorityQueue<Job> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.getHow() == b.getHow()) {
                    return a.getWhen() - b.getWhen();
                }
                return a.getHow() - b.getHow();
            }
        );

        while (finished < jobs.length) {
            for (int[] j : jobs) {
                if (j[0] <= time && j[0] > formerTime) {
                    pq.offer(new Job(j[0], j[1]));
                }
            }

            formerTime = time;

            if (!pq.isEmpty()) {
                Job j = pq.poll();
                time += j.getHow();
                answer += time - j.getWhen();
                finished++;

            } else {
                time++;
            }
        }

        return answer / jobs.length;
    }
}

class Job {
    private int when;
    private int how;

    public Job(int when, int how) {
        this.when = when;
        this.how = how;
    }

    public int getWhen() {
        return when;
    }

    public int getHow() {
        return how;
    }
}