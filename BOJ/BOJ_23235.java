package BOJ;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_23235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = 1;
        String res = "Sorting... done!";
        int input;
        while (true) {
            st = new StringTokenizer(br.readLine());
            input = Integer.parseInt(st.nextToken());
            if (input == 0) break;
            System.out.printf("Case %d: %s\n", tc, res);
            tc += 1;
        }
    }
}
