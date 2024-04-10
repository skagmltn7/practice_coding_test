package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A, B;
        int T = Integer.parseInt(st.nextToken());

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            System.out.printf("Case #%d: %d + %d = %d\n",tc,A,B,A+B);
        }
    }
}