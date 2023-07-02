package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_17256 {
    public static int getX(Cake c, Cake a) {
        return c.x - a.z;
    }

    public static int getY(Cake c, Cake a) {
        return c.y / a.y;
    }

    public static int getZ(Cake c, Cake a) {
        return c.z - a.x;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x, y, z;
        Cake[] cakes = new Cake[2];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            cakes[i] = new Cake(x, y, z);
        }
        System.out.printf("%d %d %d", getX(cakes[1], cakes[0]), getY(cakes[1], cakes[0]), getZ(cakes[1], cakes[0]));
    }

    static class Cake {
        public int x, y, z;

        Cake(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
