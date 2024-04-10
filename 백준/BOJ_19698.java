package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_19698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int W = Integer.valueOf(st.nextToken());
        int H = Integer.valueOf(st.nextToken());
        int L = Integer.valueOf(st.nextToken());

        int res = Integer.min((W / L) * (H / L), N);
        System.out.println(res);

    }
}

