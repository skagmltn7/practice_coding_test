package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_7891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long a, b;
        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            a = Long.parseLong(st.nextToken());
            b = Long.parseLong(st.nextToken());
            System.out.println(a+b);
        }
    }
}