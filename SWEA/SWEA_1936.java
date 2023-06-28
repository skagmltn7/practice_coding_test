package SWEA;
import java.io.*;
import java.util.*;

public class SWEA_1936 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()) -1 ;
        int B = Integer.parseInt(st.nextToken()) -1 ;

        char answer = 'A';
        if((A+1) % 3 == B) answer = 'B';
       System.out.println(answer);
        }
    }