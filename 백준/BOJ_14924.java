package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_14924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = Integer.valueOf(st.nextToken());
        }
        int time = input[2] / (input[0] * 2);
        System.out.println(input[1] * time);
    }
}
