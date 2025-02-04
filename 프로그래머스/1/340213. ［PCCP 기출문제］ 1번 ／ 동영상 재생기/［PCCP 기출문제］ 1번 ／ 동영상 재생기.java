class Solution {
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        String answer = "";
        
        String len[] = video_len.split(":");
        int lenn = 60 * Integer.parseInt(len[0]) + Integer.parseInt(len[1]);

        String po[] = pos.split(":");
        int poss = 60 * Integer.parseInt(po[0]) + Integer.parseInt(po[1]);

        String opss[] = op_start.split(":");
        int ops = 60 * Integer.parseInt(opss[0]) + Integer.parseInt(opss[1]);

        String opee[] = op_end.split(":");
        int ope = 60 * Integer.parseInt(opee[0]) + Integer.parseInt(opee[1]);
        
        int now = poss;

        for (int i = 0; i < commands.length; i++) {

            if (now >= ops && now <= ope) {
                now = ope;
            }

            switch (commands[i]) {

                case "prev":
                    if (now <= 10) {
                        now = 0;

                    } else {

                        now -= 10;
                    }

                    break;

                case "next":
                    if (lenn - 10 <= now) {

                        now = lenn;
                    } else {

                        now += 10;
                    }

                    break;
            }

            if (now >= ops && now <= ope) {
                now = ope;
            }

        }


        int m = now / 60;
        int s = now % 60;

        String mm;
        String ss;

        if (m < 10) {

            mm = "0" + m;
        } else {
            mm = Integer.toString(m);
        }
        if (s < 10) {
            ss = "0" + s;

        } else {
            ss = Integer.toString(s);
        }

        answer = mm + ":" + ss;
        return answer;
    }
}