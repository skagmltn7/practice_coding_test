import java.io.*;
import java.util.*;

public class BOJ_2566{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] maxInfo = new int[3];
        maxInfo[0] = Integer.MIN_VALUE;

        for(int i=0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                int num = Integer.valueOf(st.nextToken());
                if(maxInfo[0] < num){
                    maxInfo = new int[] {num,i+1,j+1};
                }
            }
        }
        System.out.println(maxInfo[0]);
        System.out.println(maxInfo[1]+" "+maxInfo[2]);
        
    }
}