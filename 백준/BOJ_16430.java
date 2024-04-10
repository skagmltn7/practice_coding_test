package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_16430 {
    static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int res = B - A;
        int gcd = gcd(res,B);
        System.out.printf("%d %d",res/gcd,B/gcd);
    }
}
