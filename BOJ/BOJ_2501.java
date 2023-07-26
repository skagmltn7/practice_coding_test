import java.io.*;
import java.util.*;

public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());

        ArrayList<Integer> arr = findFactor(n);
        try{
            System.out.println(arr.get(k-1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(0);
        }
    }

    public static ArrayList findFactor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        return arr;
    }
}