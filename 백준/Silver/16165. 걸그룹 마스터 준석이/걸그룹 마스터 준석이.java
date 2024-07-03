import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String teamName[] = new String[n];
        String memberName[][] = new String[n][];


        for (int i = 0; i < n; i++) {

            teamName[i] = br.readLine();

            int memberCount = Integer.parseInt(br.readLine());
            memberName[i] = new String[memberCount];

            for (int j = 0; j < memberCount; j++) {

                memberName[i][j] = br.readLine();
            }
        }

        ArrayList<String> memberList = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            String quizCotent = br.readLine();
            int quizType = Integer.parseInt(br.readLine());

            switch (quizType) {
                    
                case 0:

                    for (int j = 0; j < n; j++) {

                        if (teamName[j].equals(quizCotent)) {

                            for (int k = 0; k < memberName[j].length; k++) {

                                memberList.add(memberName[j][k]);
                            }

                            Collections.sort(memberList);

                            for (int k = 0; k < memberList.size(); k++) {

                                System.out.println(memberList.get(k));
                            }

                            memberList.clear();
                        }
                    }
                    break;

                case 1:

                    for (int j = 0; j < n; j++) {

                        for (int k = 0; k < memberName[j].length; k++) {

                            if (memberName[j][k].equals(quizCotent)) {

                                System.out.println(teamName[j]);
                                
                                break;
                            }
                        }
                    }
                    break;
            }
        }
    }
}