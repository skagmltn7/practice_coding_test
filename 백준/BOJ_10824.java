import java.io.*;
import java.util.*;

public class BOJ_10824{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.valueOf(st.nextToken() +st.nextToken());
        long num2 = Long.valueOf(st.nextToken() +st.nextToken());

        System.out.println(num1+num2);
    }
}
