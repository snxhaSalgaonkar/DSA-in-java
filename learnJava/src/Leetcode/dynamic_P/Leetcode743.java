package dynamic_P;

// 743. Network Delay Time
// You are given a network of n nodes, labeled from 1 to n. You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.

// We will send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal. If it is impossible for all the n nodes to receive the signal, return -1.

 
public class Leetcode743 {
    
}

// from math import inf
// class Solution:
//     def networkDelayTime(self, times: list[list[int]], n: int, v: int) -> int:

//         cost=[[inf]*(n+1) for _ in range(n+1)]
//         for s, d, p in times:
//             cost[s][d] = p
        
//         dist=cost[v][:]
//         dist[0] = 0
//         dist[v] = 0

//         for k in range(n):
//             prev_dist = dist.copy()

//             for u in range(1,n+1):
//                 if u == v:
//                     continue
//                 for i in range(1,n+1):
//                     if cost[i][u]!=inf and i!=u:
//                         if dist[u]>prev_dist[i]+cost[i][u]:
//                             dist[u]=prev_dist[i]+cost[i][u]
//         ans = max(dist)
//         return -1 if ans == inf else ans
        


// def networkDelayTime(self, times: list[list[int]], n: int, k: int) -> int:
//         dist = [inf] * (n + 1)
//         dist[k] = 0
//         for _ in range(n - 1):
//             prev = dist.copy()
//             for u, v, w in times:
//                 if prev[u] + w < dist[v]:
//                     dist[v] = prev[u] + w
//         ans = max(dist[1:])
//         return -1 if ans == inf else ans


