package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println((arr[0]+arr[1])%arr[2]);
        System.out.println(((arr[0]%arr[2])+(arr[1]%arr[2]))%arr[2]);
        System.out.println((arr[0]*arr[1])%arr[2]);
        System.out.println(((arr[0]%arr[2])*(arr[1]%arr[2])%arr[2]));
    }
}