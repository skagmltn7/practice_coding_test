package SWEA;
import java.io.*;
import java.util.*;

public class SWEA_2068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
 
        for (int i = 1; i <= T; i++) {
            int[] arr = new int[10];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int answer = -1;
            for (int j = 0; j < 10; j++) {
                if(answer < arr[j]) answer = arr[j];
            }
            System.out.printf("#%d %d\n",i,answer);
        }
    }
}