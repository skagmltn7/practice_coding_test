package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        for(int i= 0 ;i <3;i++)
            nums[i] = Integer.valueOf(st.nextToken());
        Arrays.sort(nums);
        for(int n : nums) System.out.printf("%d ",n);
    }
}
