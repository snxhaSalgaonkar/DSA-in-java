#adj matrix
import heapq
INF = float('inf')
def dijkstra(s, d, cost, n):
    dist = [float('inf')] * n
    dist[s] = 0

    pq = [(0, s)]

    while pq:
        curr_dist, u = heapq.heappop(pq)

        if curr_dist > dist[u]:
            continue
        for v in range(n):
            if cost[u][v] != INF:
                new_dist = curr_dist + cost[u][v]

                if new_dist < dist[v]:
                    dist[v] = new_dist
                    heapq.heappush(pq, (new_dist, v))

    print("Distance:", dist)
    print("Shortest distance:", dist[d])

#adj list
def dijkstra_adj_list(s, d, adj, n):
    dist = [float('inf')] * n
    dist[s] = 0

    pq = [(0, s)]

    while pq:
        curr_dist, u = heapq.heappop(pq)

        if curr_dist > dist[u]:
            continue

        for v, weight in adj[u]:
            new_dist = curr_dist + weight

            if new_dist < dist[v]:
                dist[v] = new_dist
                heapq.heappush(pq, (new_dist, v))

    print("Distance:", dist)
    print("Shortest distance:", dist[d])