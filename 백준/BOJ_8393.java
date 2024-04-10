package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int answer = 0;
        for(int i = 1; i <= n; i++) answer += i;
        System.out.println(answer);
    }
}