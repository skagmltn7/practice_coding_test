import java.io.*;
import java.util.*;

public class BOJ_3009{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<Integer, Integer> xs = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> ys = new HashMap<Integer, Integer>();
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.valueOf(st.nextToken());
            int y = Integer.valueOf(st.nextToken());

            xs.put(x, xs.getOrDefault(x, 0) + 1);
            ys.put(y, ys.getOrDefault(y, 0) + 1);
        }
        List<Integer> xList = new ArrayList(xs.keySet());
        List<Integer> yList = new ArrayList(ys.keySet());

        int resX = xs.get(xList.get(0)) == 1 ? xList.get(0) : xList.get(1);
        int resY = ys.get(yList.get(0)) ==  1 ? yList.get(0) : yList.get(1);
        
        System.out.println(resX+" "+resY);

    }

}