import java.io.*;
import java.util.*;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.valueOf(st.nextToken()) * 60;
        int m = Integer.valueOf(st.nextToken());

        int cost = Integer.valueOf(br.readLine());
        int total = h + m + cost;
        System.out.println(total / 60 % 24 + " " + total % 60);

    }
}