package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_15700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.valueOf(st.nextToken());
        long b = Long.valueOf(st.nextToken());
        System.out.println((a*b)/2);
    }
}

