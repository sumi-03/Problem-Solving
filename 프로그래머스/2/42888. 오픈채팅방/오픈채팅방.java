import java.util.HashMap;
import java.util.ArrayList;


class Solution {
    public String[] solution(String[] record) {

        // 아이디가 키, 이름이 값
        HashMap<String, String> name = new HashMap<>();
        ArrayList<String> answerList = new ArrayList<>();

        for (String i : record) {

            if (!i.startsWith("L")) {

                String tmp[] = i.split(" ");
                name.put(tmp[1], tmp[2]);

            }
        }

        for (String i : record) {

            if (!i.startsWith("C")) {

                String tmp[] = i.split(" ");

                switch (tmp[0]) {

                    case "Enter":
                        answerList.add(name.get(tmp[1]) + "님이 들어왔습니다.");
                        break;
                        
                    case "Leave":

                        answerList.add(name.get(tmp[1]) + "님이 나갔습니다.");
                        break;
                }

            }
        }

        String answer[] = answerList.toArray(new String[answerList.size()]);

        return answer;
    }

}