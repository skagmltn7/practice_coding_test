package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_27959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (N * 100 >= M) System.out.println("Yes");
        else System.out.println("No");
    }
}
