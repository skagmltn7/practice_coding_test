package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1 = Integer.valueOf(st.nextToken());
        int S = Integer.valueOf(st.nextToken());
        System.out.println(S * 2 - R1);
    }
}
