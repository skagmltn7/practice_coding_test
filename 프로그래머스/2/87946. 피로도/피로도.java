class Solution {
    int ans = 0;
    boolean[] visited;
    int max;
    public int solution(int k, int[][] dungeons) {
        max = dungeons.length;
        visited = new boolean[max];
        dfs(0,k,dungeons);
        return ans;
    } // end of solution
    
    public void dfs(int cnt, int k, int[][] dungeons){
        ans = Math.max(ans,cnt);
        for(int inx = 0; inx<max; inx++){
            if(k<dungeons[inx][0] || k-dungeons[inx][1] < 0|| visited[inx]) continue;
            visited[inx]=true;
            dfs(cnt+1,k-dungeons[inx][1],dungeons);
            visited[inx]=false;
        }
    }
} // end of Solution