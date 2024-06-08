import java.util.*;

class Solution {
    static final int MOD = 1000000007;
    
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n+2][m+2];
        
        map[1][1]=1;
        
        for(int[] puddle: puddles){
            map[puddle[1]][puddle[0]] = -1;
        }
        
        for(int y = 1; y<=n; y++){
            for(int x = 1; x <= m; x++){
                if(map[y][x]==-1){
                    map[y][x]=0;
                    continue;
                }
                map[y][x] += map[y-1][x]%MOD;
                map[y][x] += map[y][x-1]%MOD;
            }
        }
        return map[n][m]%MOD;
    } // end of main

    
    public boolean checkRange(int ny, int nx, int n, int m){
        return 1<=ny && ny <= n && 1<= nx && nx <= m;
    }
} // end of class