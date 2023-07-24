import java.io.*;
import java.util.*;

public class BOJ_10953{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),",");
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());
            System.out.println(a+b);
        }
    }
}
