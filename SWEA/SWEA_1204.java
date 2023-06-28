package SWEA;
import java.io.*;
import java.util.*;
 
public class SWEA_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cnt;
        StringTokenizer st;
        int tc;
 
        for(int i = 0; i < T; i++) {
            tc = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            cnt = new HashMap<>();
            for (int j = 0; j < 1000; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (cnt.getOrDefault(num, -1) == -1)
                    cnt.put(num, 1);
                else cnt.put(num, cnt.get(num) + 1);
            }
            int answer = 0;
            int max = -1;
 
            for(int key:cnt.keySet()){
                int val = cnt.get(key);
                if(max < val){
                    answer = key;
                    max = val;
                } else if (max == val && answer < key) {
                    answer = key;
                }
            }
            System.out.printf("#%d %d\n",tc,answer);
        }
    }
}