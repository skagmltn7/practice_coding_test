import java.io.*;
import java.util.*;

public class BOJ_2460{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int before = 0;
        for(int i=1;i<=10;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int getOff = Integer.valueOf(st.nextToken());
            int getOn = Integer.valueOf(st.nextToken());
            before += getOn - getOff;
            if(max<before){
                max = before;
            }
        }
        System.out.println(max);
    }
}