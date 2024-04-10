package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] scores = new int[2];
        for(int i = 0 ; i<2;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <4 ; j++)
                scores[i] += Integer.valueOf(st.nextToken());
        }
        System.out.println(Arrays.stream(scores).max().getAsInt());
    }
}
