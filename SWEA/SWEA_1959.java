package SWEA;
import java.io.*;
import java.util.*;
 
public class SWEA_1959 {
    public static void findMaxVal(int tc, int[] shorter,int[] longer){
        int answer = Integer.MIN_VALUE;
        int tmp;
        for(int i=0; i < longer.length - shorter.length + 1; i++){
            tmp = 0;
            for(int j=0; j<shorter.length; j++){
                tmp += shorter[j] * longer[i+j];
            }
            answer = Integer.max(answer, tmp);
        }
        System.out.printf("#%d %d\n",tc,answer);
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int a, b, i;
        int[] arr1, arr2;
 
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
 
            st = new StringTokenizer(br.readLine());
            arr1 = new int[a];
            for (i = 0; i < a; i++) arr1[i] = Integer.parseInt(st.nextToken());
 
            st = new StringTokenizer(br.readLine());
            arr2 = new int[b];
            for (i = 0; i < b; i++) arr2[i] = Integer.parseInt(st.nextToken());
 
            if (a > b) findMaxVal(tc,arr2, arr1);
            else findMaxVal(tc, arr1, arr2);
        }
    }
}