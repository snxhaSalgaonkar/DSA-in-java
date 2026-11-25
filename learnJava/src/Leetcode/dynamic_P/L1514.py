
import heapq

class Solution:
    def maxProbability(self, n, edges, succProb, s, d):

        adj = [[] for _ in range(n)]

        for i in range(len(edges)):
            u, v = edges[i]
            p = succProb[i]

            adj[u].append((v, p))
            adj[v].append((u, p))

        dist = [0] * n
        dist[s] = 1

        pq = [(-1, s)]

        while pq:
            prob, u = heapq.heappop(pq)
            prob = -prob

            if u == d:
                return prob

            if prob < dist[u]:
                continue

            for v, p in adj[u]:
                new_prob = prob * p

                if new_prob > dist[v]:
                    dist[v] = new_prob
                    heapq.heappush(pq, (-new_prob, v))

        return 0
