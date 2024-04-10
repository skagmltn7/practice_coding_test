package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_6764 {
    static int[] depth;
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        depth = new int[4];
        
        for(int i=0;i<4;i++){
            depth[i] = Integer.valueOf(br.readLine());
        }
        if(increasing()) System.out.println("Fish Rising");
        else if(decreasing()) System.out.println("Fish Diving");
        else if(identical()) System.out.println("Fish At Constant Depth");
        else System.out.println("No Fish");
    }
    
    public static boolean increasing(){
        for(int i=1; i<4;i++){
            if(depth[i-1] >= depth[i]) return false;
        }
        return true;
    }
    
    public static boolean decreasing(){
        for(int i=1; i<4;i++){
            if(depth[i-1] <= depth[i]) return false;
        }
        return true;
    }
    
    public static boolean identical(){
        for(int i=1; i<4;i++){
            if(depth[i-1] != depth[i]) return false;
        }
        return true;
    }
}
