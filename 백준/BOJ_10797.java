package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int date = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            if (date == Integer.valueOf(st.nextToken()))
                answer += 1;
        }
        System.out.println(answer);
    }
}
