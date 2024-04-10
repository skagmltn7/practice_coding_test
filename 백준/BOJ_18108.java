package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int thaiYear = Integer.parseInt(st.nextToken());
        System.out.println(thaiYear-543);
    }
}