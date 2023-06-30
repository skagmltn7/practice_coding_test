package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] horses = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", horses[i] - Integer.parseInt(st.nextToken()));
        }
    }
}