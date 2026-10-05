package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class leetcode1971 {
    public static void bfs(int start, int end , List<List<Integer>> adj, boolean[]vis ){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        while ((q.size()!=0)) {
            int front = q.remove();
            for(int ele: adj.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele]=true;
                }
            }
            
        }

    }
    public static boolean validPath(int n, int[][] edg, int start, int end) {
        if (start==end){
            return true;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> lst =new ArrayList<>();
            adj.add(lst);
        }
        for(int i=0; i<edg.length;i++){
            int a = edg[i][0];
            int b = edg[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);   
        }
        System.out.println(adj);
        boolean[]vis =new boolean[n];
        vis[start]=true;
        bfs(start, end,adj,vis);
        return vis[end];   
    }


    //leetcode 841
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n= adj.size();
        boolean[] vis = new boolean[n];//false;
        vis[0]=true;

        bfs(0,adj,vis);
    

        for(boolean ele: vis){
            if(ele==false){
                return false;
            }
        }
        return true;

        
    }
    private void bfs(int start, List<List<Integer>> adj, boolean[] vis) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        while (q.size()!=0) {
            int front = q.remove();
            for(int ele: adj.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele]=true;
                }
            }
            
        }

    }



    //leetcode 200
    class Solution {
    
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return count;  
    }
    

}
    public static void main(String[] args) {
        int n=3;
        int[][] edg ={{0,1},{1,2},{2,0}};
        int start=0;
        int end =2;
        boolean ans = validPath(n,edg,start,end);
        System.out.println(ans);
    }
    
}
