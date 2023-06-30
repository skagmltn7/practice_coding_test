package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i =0; i < n/4;i++){
            System.out.printf("%s ", "long");
        }
        System.out.println("int");
    }
}
