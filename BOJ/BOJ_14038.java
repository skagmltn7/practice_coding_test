package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_14038 {
    static int win;
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        win = 0;
        for(int i =0;i<6;i++){
            if(br.readLine().equals("W")){
                win++;
            }
        }
        
        System.out.println(getGroup());
    }
    static int getGroup(){
        if(win==0) return -1;
        else if(win < 3) return 3;
        else if(win<5) return 2;
        return 1;
    }
}
