package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_27294 {
    public static int riceCnt(int T, int chk) {
        if (T >= 12 && T <= 16 && chk == 0) return 320;
        return 280;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int chk = Integer.parseInt(st.nextToken());

        System.out.println(riceCnt(T, chk));
    }
}
