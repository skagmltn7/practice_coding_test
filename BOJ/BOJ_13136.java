package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_13136 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.valueOf(st.nextToken());
        int c = Integer.valueOf(st.nextToken());
        int n = Integer.valueOf(st.nextToken());

        long x, y;
        if(r % n != 0){
            x = r/n + 1;
        }else{
            x = r/n;
        }
        if(c%n !=0){
            y = c/n + 1;
        }else{
            y = c/n;
        }
        System.out.println(x*y);
    }
}

