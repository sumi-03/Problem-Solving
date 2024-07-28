import java.io.*;


class Main {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch == 'c') {

                if (i + 1 < input.length() && (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {

                    i++;
                }
            }
            else if (ch == 'd') {

                if (i + 1 < input.length() && input.charAt(i + 1) == '-') {

                    i++;
                }
                else if (i + 2 < input.length() && input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {

                    i += 2;
                }
            }
            else if (ch == 'l') {

                if (i + 1 < input.length() && input.charAt(i + 1) == 'j') {

                    i++;
                }
            }
            else if (ch == 'n') {

                if (i + 1 < input.length() && input.charAt(i + 1) == 'j') {

                    i++;
                }
            }
            else if (ch == 's') {

                if (i + 1 < input.length() && input.charAt(i + 1) == '=') {

                    i++;
                }
            }
            else if (ch == 'z') {

                if (i + 1 < input.length() && input.charAt(i + 1) == '=') {

                    i++;
                }
            }

            count++;
        }

        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}