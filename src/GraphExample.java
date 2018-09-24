/**
 * Created by issacholguin1 on 7/25/18.
 */
import java.util.*;
import java.util.LinkedList;

// ************ Implementation based on https://www.youtube.com/watch?v=fjT3WDKiAkI ****************


class Graph {




    class Edge{
        int v, w; // v verti
        public Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return "" + v;
            //return "(" + v + "," + w + ")";
        }

    }

    List<Edge> G[]; // list of edges that we defined as containing V, W

    public Graph(int n) { // number of verticies as n, n will be the size of the LinkedList Array
        G = new LinkedList[n];
        for (int i = 0; i < G.length; i++) {
            G[i] = new LinkedList<Edge>();
        }
    }

    boolean isConnected(int u, int v) {
        for (Edge i : G[u]) {
            if (i.v == v) return true;

        }
        return false;
    }

    void addEdge(int u, int v, int w) {
        G[u].add(new Edge(v, w));// reason for adding in the begining (hence the 0), it takes O(1) to add in beggining vs O(n) at end.
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < G.length; i++) {
            result.append(i + "==>" + G[i] + "\n");
        }
        return result.toString();

    }

    public void DFS() {
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for (int i = 0; i < G.length; i++) {
            if (!G[i].isEmpty()) {
                System.out.println(G[i]);
                visited.put(i, false);
            }
        }

        System.out.println(visited + "\n \n \n \n");

        for (int i = 0; i < G.length; i++) {
            if (!G[i].isEmpty()) {
                System.out.print("DFS Search Traversal: ");
                recursiveDFS(i, visited, G[i]);
                break;
            }
        }

    }

    private void recursiveDFS(int i, HashMap<Integer, Boolean> visited, List<Edge> edges) {
        System.out.print(i + " ");
        visited.put(i, true);

        for (Edge e : G[i]) {
            if (!visited.get(e.v)) {
                recursiveDFS(e.v, visited, G[e.v]);
            }
        }
    }

    public void BFS() {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        Queue<Integer> queue = new Queue<>();
        int root;

        for (int i = 0; i < G.length; i++) {
            if (!G[i].isEmpty()) {
                System.out.println(G[i]);
                visited.put(i, false);
            }
        }

        // add the first instance of a Edge list with Edges in it.
        for (int i = 0; i < G.length; i++) {
            if (!G[i].isEmpty()) {
                queue.add(i);
                visited.put(i, true);
                break;
            }
        }
        queue.printQueue();


        System.out.print("BFS Search Traversal:");
        while (!queue.isEmpty()) {
            int i = queue.remove();
            //queue.printQueue();
            System.out.print(" " + i);
            for (Edge e: G[i]) {
                if (visited.get(e.v) == false) {
                    queue.add(e.v);
                    visited.put(e.v, true);
                }
            }
        }

    }

    public void isARoute(int node1, int node2) {
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for (int i = 0; i < G.length; i++) {
            if (!G[i].isEmpty()) {
                System.out.println(G[i]);
                visited.put(i, false);
                for (Edge e : G[i]) {
                    visited.put(e.v, false);
                }
            }
        }

        System.out.println(visited + "\n \n \n \n");


        if (isARouteRecursively(G, node1, node2, visited)) {
            System.out.print("There is a route between " + node1 + " and " + node2);
        } else {
            System.out.print("No route between " + node1 + " and " + node2);
        }
    }

    private boolean isARouteRecursively(List<Edge>[] G, int node1, int node2, HashMap<Integer, Boolean> visited) {

        if (node1 == node2) { return true; }

        visited.put(node1, true);

        for (Edge e : G[node1]) {
            if (visited.get(e.v) == false) {
                if (isARouteRecursively(G, e.v, node2, visited)) {
                    visited.put(node1, false);
                }
            }
        }
        visited.put(node1, false);
        return false;



    }


    public boolean isARouteBFS(int node1, int node2) {
        Queue<Integer> queue = new Queue<>();
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for (int i = 0; i < G.length; i++) {
            if (!G[i].isEmpty()) {
                System.out.println(G[i]);
                visited.put(i, false);
                for (Edge e : G[i]) {
                    visited.put(e.v, false);
                }
            }
        }

        visited.put(node1, true);
        queue.add(node1);

        while (!queue.isEmpty()) {
            queue.printQueue();
            int current = queue.remove();

            for (Edge e : G[current]) {
                if (visited.get(e.v) == false) {
                    if (e.v == node2) {
                        return true;
                    } else {
                        visited.put(e.v, true);
                        queue.add(e.v);
                        queue.printQueue();
                    }
                }
            }
            visited.put(current, false);

        }
        return false;

    }


}

public class GraphExample {


    public static void main(String[] args) {

        // ***** Tests for DFS and BFS Searching ************
        /*Graph g = new Graph(10);
        g.addEdge(0, 2, 10);
        g.addEdge(0, 5, 15);
        g.addEdge(2, 3, 10);
        g.addEdge(2, 5, 10);
        g.addEdge(3, 4, 10);
        g.addEdge(3, 6, 10);
        g.addEdge(5, 8, 10);
        g.addEdge(5, 9, 10);
        g.addEdge(8, 9, 10);




        System.out.println(g);
        g.DFS();
        System.out.println("\n \n \n \n \n");

        g.BFS();*/

        Graph g = new Graph(10);
        g.addEdge(0, 2, 10);
        g.addEdge(0, 5, 15);
        g.addEdge(2, 3, 10);
        g.addEdge(2, 5, 10);
        g.addEdge(3, 4, 10);
        g.addEdge(3, 6, 10);

        //g.isARoute(0,5);
        System.out.println(g.isARouteBFS(5,0));





    }
}
