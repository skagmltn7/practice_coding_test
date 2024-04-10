import java.io.*;
import java.util.*;

public class BOJ_5086{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());
            if(a==0 && b==0) break;
            if(a%b==0) System.out.println("multiple");
            else if(b%a==0) System.out.println("factor");
            else System.out.println("neither");
        }
    }
}