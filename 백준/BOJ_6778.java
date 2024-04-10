package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_6778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int antenna = Integer.valueOf(br.readLine());
        int eyes = Integer.valueOf(br.readLine());

        if (antenna >= 3 && eyes < 4)
            System.out.println("TroyMartian");
        if (antenna <= 6 && eyes >= 2)
            System.out.println("VladSaturnian");
        if (antenna <= 2 && eyes <= 3)
            System.out.println("GraemeMercurian");

    }
}
