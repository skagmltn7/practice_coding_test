import java.io.*;
import java.util.*;

public class BOJ_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] winnerInfo = new int[2];
        winnerInfo[1] = Integer.MIN_VALUE;

        for(int i=1;i<=5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int total = 0;
            for(int j=0;j<4;j++){
                total += Integer.valueOf(st.nextToken());
            }
            if(total > winnerInfo[1]){
                winnerInfo = new int[] {i,total};
            }
        }
        System.out.println(winnerInfo[0]+" "+winnerInfo[1]);
    }
}