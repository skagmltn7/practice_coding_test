package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int num = 0;

        HashMap<Integer,Integer> cnt = new HashMap<>();
        for(int i=0;i<3;i++){
            num = Integer.valueOf(st.nextToken());
            if(cnt.getOrDefault(num,-1)!=-1) cnt.put(num,cnt.get(num)+1);
            else cnt.put(num,1);
        }

        switch(cnt.keySet().size()) {
            case 1:
                System.out.printf("%d", num * 1000 + 10000);
                break;
            case 2:
                for(int n:cnt.keySet()) {
                    if (cnt.get(n) == 2) {
                        System.out.printf("%d", n * 100 + 1000);
                        break;
                    }
                }
                break;
            default:
              int max =  cnt.keySet().stream().max(Integer::compare).get();
              System.out.printf("%d",max*100);
        }
    }
}
