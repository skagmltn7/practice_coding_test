package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> cnt = new HashMap<>();
        int z = Integer.valueOf('z');
        int a = Integer.valueOf('a');
        for (int i = 0; i < z - a + 1; i++) {
            cnt.put((char) ('a' + i), 0);
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            cnt.put(s.charAt(i), cnt.get(s.charAt(i)) + 1);
        }

        for (int i = a; i < z + 1; i++) {
            System.out.printf("%d ", cnt.get((char) i));
        }
    }
}
