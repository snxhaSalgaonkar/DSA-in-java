# 1928. Minimum Cost to Reach Destination in Time
# Solved
# Hard
# Topics
# premium lock icon
# Companies
# Hint
# There is a country of n cities numbered from 0 to n - 1 where all the cities are connected by bi-directional roads. The roads are represented as a 2D integer array edges where edges[i] = [xi, yi, timei] denotes a road between cities xi and yi that takes timei minutes to travel. There may be multiple roads of differing travel times connecting the same two cities, but no road connects a city to itself.


class Solution:
    def minCost(self, maxTime: int, edges: list[list[int]], passingFees: list[int]) -> int:

        n=len(passingFees)
        s=0
        d=n-1
        adj = [[] for _ in range(n)]

        for u, v, w in edges:
            adj[u].append((v, w))
            adj[v].append((u, w))

        
        # dp[v][t] = minimum cost to reach v in exactly t time
        dp = [[float('inf')] * (maxTime + 1) for _ in range(n)]

        pq = [(passingFees[s],0, s)]
        dp[s][0] = passingFees[s]

        while pq:
            curr_fees ,curr_time, u = heapq.heappop(pq)

            if curr_fees > dp[u][curr_time]:
                continue

            for v, weight in adj[u]:
                new_time = curr_time + weight
                new_fees = curr_fees + passingFees[v]

                if new_time <= maxTime and new_fees < dp[v][new_time]:
                    dp[v][new_time]= new_fees
                    
                    heapq.heappush(pq, (new_fees,new_time, v))
        mincost=min(dp[d])           
        return -1 if mincost == float('inf') else mincost
