package Practical4;
import java.util.*;


class GraphEdge implements Comparable<GraphEdge> {
    int src, dest, weight;

    public GraphEdge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(GraphEdge edge) {
        return this.weight - edge.weight;
    }
}

public class prac43 {
    public static List<GraphEdge> primMST(int n, List<List<GraphEdge>> adjList) {
        boolean[] visited = new boolean[n];
        PriorityQueue<GraphEdge> minHeap = new PriorityQueue<>();
        List<GraphEdge> mst = new ArrayList<>();

        visited[0] = true;
        minHeap.addAll(adjList.get(0));

        while (!minHeap.isEmpty()) {
            GraphEdge edge = minHeap.poll();
            int src = edge.src;
            int dest = edge.dest;

            if (visited[dest]) {
                continue;
            }

            visited[dest] = true;
            mst.add(edge);

            for (GraphEdge nextEdge : adjList.get(dest)) {
                if (!visited[nextEdge.dest]) {
                    minHeap.add(nextEdge);
                }
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        int n = 5; // Number of vertices in the graph
        List<List<GraphEdge>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(new GraphEdge(0, 1, 2));
        adjList.get(0).add(new GraphEdge(0, 3, 6));
        adjList.get(1).add(new GraphEdge(1, 0, 2));
        adjList.get(1).add(new GraphEdge(1, 2, 3));
        adjList.get(1).add(new GraphEdge(1, 3, 8));
        adjList.get(1).add(new GraphEdge(1, 4, 5));
        adjList.get(2).add(new GraphEdge(2, 1, 3));
        adjList.get(2).add(new GraphEdge(2, 4, 7));
        adjList.get(3).add(new GraphEdge(3, 0, 6));
        adjList.get(3).add(new GraphEdge(3, 1, 8));
        adjList.get(3).add(new GraphEdge(3, 4, 9));
        adjList.get(4).add(new GraphEdge(4, 1, 5));
        adjList.get(4).add(new GraphEdge(4, 2, 7));
        adjList.get(4).add(new GraphEdge(4, 3, 9));

        List<GraphEdge> mst = primMST(n, adjList);

        System.out.println("Minimum Spanning Tree Edges:");
        for (GraphEdge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}

