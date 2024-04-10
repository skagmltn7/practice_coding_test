package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;
        int answer = 0;
        for(int i = 0; i<5; i++){
            score = Integer.valueOf(br.readLine());
            if(score < 40) score = 40;
            answer += score;
        }
        System.out.println(answer/5);

    }
}
