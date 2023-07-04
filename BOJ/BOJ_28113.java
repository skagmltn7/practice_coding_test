package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_28113 {
    public static String compare(int bus, int subway) {
        if (bus < subway) return "Bus";
        else if (bus == subway) return "Anything";
        else return "Subway";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int walk = Integer.valueOf(st.nextToken());
        int bus = Integer.valueOf(st.nextToken());
        int subway = Integer.valueOf(st.nextToken());
        System.out.println(compare(bus, subway));
    }
}
