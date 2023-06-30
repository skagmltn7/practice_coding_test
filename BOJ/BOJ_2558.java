package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(arr[0] + arr[1]);
    }
}