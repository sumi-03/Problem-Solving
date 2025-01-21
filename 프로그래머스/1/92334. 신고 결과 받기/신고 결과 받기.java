import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        ArrayList<Integer> answerList = new ArrayList<>();
        int[] answer = {};

        // 키는 신고 당한 사람, 값은 신고 한 사람들
        HashMap<String, HashSet<String>> info = new HashMap<>();

        // 키는 유저, 값은 그 유저가 신고한 사람 중 정지 처리 된 사람 명수
        HashMap<String, Integer> mail = new HashMap<>();


        for (int i = 0; i < id_list.length; i++) {

            mail.put(id_list[i], 0);
        }

        for (int i = 0; i < report.length; i++) {

            String detail[] = report[i].split(" ");
            info.computeIfAbsent(detail[1], aa -> new HashSet<String>()).add(detail[0]);
        }

        for (String person : info.keySet()) {

            // 여기서의 person 은 신고 당한 사람 각각
            // k번 이상 신고 당한 경우, 정지 처리 되는 경우
            if (info.get(person).size() >= k) {

                // 여기서의 who 는 신고 당한 사람을 신고한 사람 각각
                for (String who : info.get(person)) {

                    mail.put(who, mail.getOrDefault(who, 0) + 1);
                }

            }

        }

        for (int i = 0; i < id_list.length; i++) {

            answerList.add(mail.get(id_list[i]));
        }

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}