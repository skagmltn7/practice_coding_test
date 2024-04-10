package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int correct = Integer.valueOf(st.nextToken()) * Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int news = 0;
        for (int i = 0; i < 5; i++) {
            news = Integer.valueOf(st.nextToken());
            System.out.printf("%d ", news - correct);
        }
    }
}
