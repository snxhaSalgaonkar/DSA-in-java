class Solution:
    def findTheCity(self, n: int, edges: list[list[int]], distanceThreshold: int) -> int:
        class Solution:
    def findTheCity(self, n: int, edges: list[list[int]], distanceThreshold: int) -> int:

        dist=[[inf]*n for _ in range(n)]
        for i in range(n):
            dist[i][i]=0
        for u,v,w in edges:
            dist[u][v]=w
            dist[v][u]=w

        for k in range(n):
            for i in range(n):
                for j in range(n):
                    dist[i][j]=min(
                        dist[i][j],
                        dist[i][k]+dist[k][j]
                    )
        min_count=float('inf')
        result=-1
        for i in range(n):
            count=0
            for j in range(n):
                if i!=j and dist[i][j]<=distanceThreshold:
                    count+=1

            if count<=min_count:
                min_count=count
                result=i

        return result
        