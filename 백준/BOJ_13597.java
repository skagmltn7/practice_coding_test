package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_13597 {
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[2];
        
        for(int i=0;i<2;i++){
            nums[i] = Integer.valueOf(st.nextToken());
        }

        System.out.println(Integer.max(nums[0],nums[1]));
    }
}
