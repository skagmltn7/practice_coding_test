package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer;
        String str;
        while (true) {
            String cur = br.readLine();
            if (cur.equals("#")) break;
            st = new StringTokenizer(cur, " .,!?");
            answer = 0;
            while (st.hasMoreTokens()) {
                str = st.nextToken().toLowerCase();
                for (int i = 0; i < str.length(); i++) {
                    switch (str.charAt(i)) {
                        case 'a': case 'e': case 'i': case 'o': case 'u':
                            answer += 1;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
