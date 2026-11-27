from collections import deque
class Solution:
    def nearestExit(self, maze: list[list[str]], entrance: list[int]) -> int:
        m=len(maze)
        n=len(maze[0])
        moves =[[0,-1],[-1,0],[0,1],[1,0]]
        visited = [[0]*n for _ in range(m)]

        #(i,j,step)
        q=deque()
        
        q.append((entrance[0], entrance[1],0))
        visited[entrance[0]][entrance[1]] = 1
        while q:
            x,y,step=q.popleft()
            
            #get other possible soln
            for p,r in moves:
                a=x+p
                b=y+r
                if a<0 or a>m-1 or b<0 or b>n-1:
                    continue 
                if maze[a][b]=='.' and visited[a][b]==0:
                    if a==0 or b==0 or a==m-1 or b==n-1 :
                        return step+1
                    visited[a][b]=1
                    q.append((a,b,step+1))

        return -1
                


        