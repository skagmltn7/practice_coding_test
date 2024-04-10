package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_15059 {
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] available = new int[3];
        int[] want = new int[3];
        
        for(int i=0; i<3;i++){
            available[i] = Integer.valueOf(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<3;i++){
            want[i] = Integer.valueOf(st.nextToken());
        }
        
        int res = 0;
        for(int i=0;i<3;i++){
            if(want[i] - available[i] > 0){
                res += want[i] - available[i];
            }
        }
        System.out.println(res);
    }
}
