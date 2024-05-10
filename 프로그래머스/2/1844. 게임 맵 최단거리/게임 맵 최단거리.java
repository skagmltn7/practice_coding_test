import java.util.*;

class Solution {
    static final int[] DY = {-1,0,1,0};
    static final int[] DX = {0,1,0,-1};
    
    class Person{
        int y,x,cnt;
        public Person(int y, int x, int cnt){
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }
    } // end of Person
    
    public int solution(int[][] maps) {
        return move(maps, maps.length, maps[0].length);
    }// end of solution
    
    public int move(int[][] maps, int n, int m){
        ArrayDeque<Person> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        visited[0][0]=true;
        queue.offer(new Person(0,0,1));
        
        while(!queue.isEmpty()){
            Person cur = queue.poll();
            
            if(cur.y==n-1 && cur.x==m-1){
                return cur.cnt;
            }
            
            for(int i=0;i<4;i++){
                int ny = cur.y + DY[i];
                int nx = cur.x + DX[i];
                
                if(!checkRange(ny,nx,n,m) || maps[ny][nx]==0 || visited[ny][nx]) continue;
                
                visited[ny][nx]=true;
                queue.offer(new Person(ny,nx,cur.cnt+1));
            }
        }
        return -1;
    } // end of move
    
    public boolean checkRange(int y, int x, int n, int m){
        return 0 <= y && y < n && 0 <= x && x < m;
    }
}// end of Solution