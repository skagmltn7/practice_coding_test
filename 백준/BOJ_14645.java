package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_14645 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) st = new StringTokenizer(br.readLine());

        System.out.println("비와이");
    }
}