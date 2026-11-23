package graphs;

import java.util.List;

public class leetcode843 {
    class Solution {
    List<List<Integer>> graph;
    int[] size;
    int[] distSum;
    int[] answer;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {

        // build graph


        // initialize arrays


        // first DFS
        dfs1(0, -1);

        answer[0] = distSum[0];

        // second DFS
        dfs2(0, -1);

        return answer;
    }

    void dfs1(int node, int parent) {

        // calculate size[node]
        // calculate distSum[node]


    }

    void dfs2(int node, int parent) {

        // calculate answer[child]


    }
}
    
}
