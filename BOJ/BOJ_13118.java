package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_13118 {
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] p = new int[4];
        for(int i=0;i<4;i++){
            p[i] = Integer.valueOf(st.nextToken());
        }
        
        int[] appleInfo = new int[3];
        st = new StringTokenizer(br.readLine());
        int x = Integer.valueOf(st.nextToken());
        for(int i=0;i<4;i++){
            if(p[i] == x){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(0);
    }
}
