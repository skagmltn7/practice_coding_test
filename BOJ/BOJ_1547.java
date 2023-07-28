import java.io.*;
import java.util.*;

public class BOJ_1547 {
    static int cup1, cup2; 
    static ArrayList<Integer> cups = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.valueOf(br.readLine());

        for(int i=1;i<4;i++){
            cups.add(i);
        }

        for (int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cup1 = Integer.valueOf(st.nextToken());
            cup2 = Integer.valueOf(st.nextToken());
            if(cup1!=cup2) swap(cups,cup1,cup2);
        }
        System.out.println(cups.get(0));
    }

    static void swap(ArrayList<Integer> cups, int cup1, int cup2){
        int tmp1 = cups.indexOf(cup1);
        int tmp2 = cups.indexOf(cup2);
        cups.set(tmp1,cup2);
        cups.set(tmp2,cup1);
    }
}