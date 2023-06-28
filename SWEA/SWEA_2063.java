package SWEA;
import java.io.*;
import java.util.*;
 
public class SWEA_2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
 
        int[] arr = new int[N];
        for (int j = 0; j < N; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        int middle = N/2;
        System.out.printf("%d\n",arr[middle]);
    }
}