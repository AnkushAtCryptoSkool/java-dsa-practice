package graphs;

import java.util.ArrayList;

public class Graph {

    public void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,3));

        graph[1].add(new Edge(1,2,4));
        graph[1].add(new Edge(1,3,5));

        graph[2].add(new Edge(2,0,10));
        graph[2].add(new Edge(2,1,3));
        graph[2].add(new Edge(2,4,7));

        graph[3].add(new Edge(3,1,6));
        graph[3].add(new Edge(3,2,9));

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
    public static void main(String[] args) {
        int n = 4;
        Graph graph = new Graph();
        // array int arr[] = new int[5]
        ArrayList<Edge>  graphList[] = new ArrayList[n];
        graph.createGraph(graphList);
        graph.printGraph(graphList);
    }
}
