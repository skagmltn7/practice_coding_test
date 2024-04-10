package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_11549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int correct = 0;

        for (int i = 0; i < 5; i++) {

            if (T.equals(st.nextToken())) {
                correct++;
            }
        }
        System.out.println(correct);
    }
}
