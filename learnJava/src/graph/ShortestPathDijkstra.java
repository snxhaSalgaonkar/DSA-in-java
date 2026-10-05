import java.util.*;

class Edge {
    int v;
    int wt;

    Edge(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
}

class Pair {
    int dist;
    int vertex;

    Pair(int dist, int vertex) {
        this.dist = dist;
        this.vertex = vertex;
    }
}

public class ShortestPathDijkstra {

    static void dijkstra(ArrayList<ArrayList<Edge>> graph, int src, int V) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        // Min Heap based on distance
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> a.dist - b.dist
        );
        pq.add(new Pair(0, src));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.vertex;
            for (Edge e : graph.get(u)) {
                if (dist[u] + e.wt < dist[e.v]) {
                    dist[e.v] = dist[u] + e.wt;
                    pq.add(new Pair(dist[e.v], e.v));
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 2));
        graph.get(0).add(new Edge(2, 4));

        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 7));

        graph.get(2).add(new Edge(4, 3));

        graph.get(3).add(new Edge(5, 1));

        graph.get(4).add(new Edge(3, 2));
        graph.get(4).add(new Edge(5, 5));

        dijkstra(graph, 0, V);
    }
}

//time complexity 
// O(E log V) where E is the number of edges and V is the number of vertices in the graph.