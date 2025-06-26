package graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class leetcode547 {
    public void bfs(int x,boolean [] vis, int[][] adj){
        vis[x]=true;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(x);
        while (q.size()!=0) {
            int front=q.remove();
            for (int i = front+1; i < adj.length; i++) {
                if(adj[front][i]==1){
                    q.add(i);
                    vis[i]=true;
                }
                
            }   
        }
    }
    public int findCircleNum(int[][] adj) {
        int count=0;
        boolean[] vis =new boolean[adj.length];
        for(int i=0; i<adj.length; i++){
            if(!vis[i]){
                bfs(i,vis,adj);
                count++;
            }

            
        }
        return count;

        
    }
    public static void main(String[] args) {
        
        
    }
    
}
