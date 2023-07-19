package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_25191 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chicken = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.valueOf(st.nextToken());
        int beer = Integer.valueOf(st.nextToken());

        int eat = beer + coke / 2;

        System.out.println(Integer.min(eat, chicken));
    }
}

