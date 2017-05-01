import java.util.*;

public class Dijkstra {
	   public static void main(String args[]){ 
			Graph g = new GraphBuilder(); //creating finished unvisited graph		
			System.out.println(g.getEdges());
			dijkstra(g.GraphB(),226); //calling djikstra function
		}
     
	   // Dijkstra's algorithm to find shortest path from s to all other nodes
	   
      public static int [] dijkstra (Graph G, int s) {
         final int [] dist = new int [234];  // shortest known distance from "s"
        final int [] pred = new int [234];  // preceeding node in path
         final boolean [] visited = new boolean [234]; // all false initially
   
         for (int i=1; i<dist.length; i++) {
           dist[i] = Integer.MAX_VALUE;
        }
  
        for (int i=1; i<dist.length; i++) {
           final int next = minVertex (dist, visited);
           visited[next] = true;
  
           // The shortest path to next is dist[next] and via pred[next].
 System.out.println(G.getVertex("100"));
           ArrayList<Edge> n =  G.getVertex("Vertex 226").getNeighbors(); //array of edges for one vertex
           for (int j=0; j< n.size(); j++) {
              //j is the index in the set of edges for a vertex
              final int d = dist[next] +n.get(j).getWeight(); //the total weight so far
             if (dist[j] > d) {
                 dist[j] = d;
                 pred[j] = next;
              }
           }
        }
        return pred;  // (ignore pred[s]==0!)
     }
  
     private static int minVertex (int [] dist, boolean [] v) {
        int x = Integer.MAX_VALUE;
        int y = -1;   // graph not connected, or no unvisited vertices
        for (int i=0; i<dist.length; i++) {
           if (!v[i] && dist[i]<x) 
           {
        	   y=i; 
        	   x=dist[i];}       
           }       
        return y; 
     }
        
        public static void printPath (Graph G, int [] pred, int s, int e)
        {      
        	ArrayList<Object> path = new ArrayList<>();       
        int x = e;       
        while (x!=s) 
        {          
        	path.add (0, G.getVertex(""+x));          
        	x = pred[x];
        	}       
        path.add (0, G.getVertex(""+x));       
        System.out.println (path);    
        }  
        } 