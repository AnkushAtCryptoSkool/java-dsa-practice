package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    public void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }
    public void printGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Edges for vertex : " + i + " are ->  ");
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.print("{" + graph[i].get(j).src + "," + graph[i].get(j).dest +"-[" + graph[i].get(j).weight +"]" + "}" + ",");
            }
            System.out.println();
        }
    }

    public void breathFirstSearch(ArrayList<Edge>[] graph, int V, boolean[] visited, int start){
        // BFS - time complexicity - O(V+E)
        Queue<Integer> q = new LinkedList<>();
        // defineing starting point of graph - 0
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(visited[curr] == false){
            System.out.print(curr + " ");
            visited[curr] = true;
             for(int i=0;i<graph[curr].size();i++){
                 Edge e = graph[curr].get(i);
                 q.add(e.dest);
             }
            }
        }
    }

    public void depthFirstSearch(ArrayList<Edge>[] graph, boolean[] visited, int curr){
        // DFS - time complexicity - O(V+E)
        System.out.print(curr + " ");
         visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dest] == false)
                depthFirstSearch(graph,visited,e.dest);
        }

    }

    public static void main(String[] args) {
        int V = 7; // vertices -V
        /*
        *    1 -----3
        *   /       |  \
        *  0        |   5 ---- 6
        *   \       | /
        *     2-----4
        * */
        Graph graph = new Graph();
        // array int arr[] = new int[5]
        ArrayList<Edge>  graphList[] = new ArrayList[V];
        graph.createGraph(graphList);
        graph.printGraph(graphList);
        graph.bfs_with_disjoint_graphs(V, graph, graphList);
        System.out.println();
        graph.dfs_with_disjoint_graphs(V,graph,graphList);
        System.out.println();
        System.out.println("Printing All Paths from 0 -> 5");
        boolean visited[] = new boolean[V];
        graph.printPaths(graphList,visited,0,"0",5);
    }

    public void printPaths(ArrayList<Edge>[] graph, boolean[] visited, int curr, String path, int target) {
        if(curr == target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dest] == false){
                visited[curr] = true;
                printPaths(graph,visited,e.dest,path+e.dest,target);
                visited[curr] = false;
            }
        }
    }

    public  void bfs_with_disjoint_graphs(int V, Graph graph, ArrayList<Edge>[] graphList) {
        boolean visited[] = new boolean[V];
        for(int i=0;i<visited.length;i++){
            if(visited[i] == false){
                graph.breathFirstSearch(graphList, V,visited,i);
            }
        }
    }

    public  void dfs_with_disjoint_graphs(int V, Graph graph, ArrayList<Edge>[] graphList) {
        boolean visited[] = new boolean[V];
        for(int i=0;i<visited.length;i++){
            if(visited[i] == false){
                graph.depthFirstSearch(graphList,visited,i);
            }
        }
    }
}
