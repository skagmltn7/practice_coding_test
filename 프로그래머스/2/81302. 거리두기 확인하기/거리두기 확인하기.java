import java.util.*;

class Solution {
    public static final int[] DR = {-1,0,1,0};
    public static final int[] DC = {0,1,0,-1};
    public static Queue<Plot> queue = new ArrayDeque<>();
    
    class Plot{
        int r, c;
        public Plot(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int i=0;i<places.length;i++){
            answer[i] = chkRoom(places[i])?1:0;
         }
        return answer;
    } // end of main
    
    public boolean chkRoom(String[] room){
        for(int r=0;r<5;r++){
            for(int c=0;c<5;c++){
                if(room[r].charAt(c)=='P'){
                    if(!bfs(room,r,c))return false;
                }
            }
        }
        return true;
    }
    
    public boolean bfs(String[] room, int row, int col){
        queue.clear();
        queue.offer(new Plot(row,col));
        
        while(!queue.isEmpty()){
            Plot cur = queue.poll();
            
            for(int i=0;i<4;i++){
                int nr = cur.r + DR[i];
                int nc = cur.c + DC[i];
                
                if(chkRange(nr,nc)||(row==nr&&col==nc))continue;
                
                int d = Math.abs(row-nr)+Math.abs(col-nc);
                
                if(room[nr].charAt(nc)=='P'&&d<=2)return false;
                else if(room[nr].charAt(nc)=='O'&&d<2){
                    queue.offer(new Plot(nr,nc));
                }
            }
        }
        return true;
    }

    public boolean chkRange(int row, int col){
        return 0>row||row>=5||0>col||col>=5;
    }
} // end of class