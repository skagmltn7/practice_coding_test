package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        StringBuffer sb;
        for (int i = 0; i < n; i++) {
            sb = new StringBuffer(br.readLine());
            System.out.println(sb.reverse());
        }
    }
}
