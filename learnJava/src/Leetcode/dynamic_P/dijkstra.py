
def dijkstra(s,d,cost,n):
    dist = [float('inf')]*n
    dist[s] = 0
    visited = [False]*n

    for i in range(n-1):
        dist[i]=cost[s][i]

    dist[s]=0
    visited[s] = True

    for num in range(n-1):
        min_dist = INF
        u = -1

        for i in range(n):
            if not visited[i] and dist[i] < min_dist:
                min_dist = dist[i]
                u = i

        if u == -1:
            break

        visited[u] = True

        for v in range(n):
            if not visited[v] and cost[u][v]!=float('inf'):
                if dist[u]+cost[u][v]<dist[v]:
                    dist[v]=dist[u]+cost[u][v]

    print("distance")
    print(dist)


INF = float('inf')

cost = [
    [0,   29,  26, 24,  15,  32,  22,  26],
    [INF,  0,  15,  INF, 11, 26,  25,  INF],
    [17, INF, 0, 30, 15, 35, INF, INF],
    [INF, 21, 25, 0,25,INF,INF,21],
    [INF,INF,INF,21,0,25,10,14],
    [35,INF,INF, 22,26,0,21,31],
    [28,20,23,30,INF,INF,0,INF],
    [INF,15,18,INF,INF,17,INF,0]
    
]  
n=8 
dijkstra(0,n-1,cost,n)   
    

