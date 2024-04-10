import java.io.*;
import java.util.*;

public class BOJ_2506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] isCorrect = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (st.nextToken().equals("1"))
                isCorrect[i] = true;
        }
        
        int[] score = new int[n];
        score[0] = isCorrect[0]? 1:0;
        int total = score[0];
        for (int i = 1; i < n; i++) {
            score[i] = isCorrect[i] ? score[i - 1] + 1 : 0;
            total += score[i];
        }
        System.out.println(total);
    }
}