import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class GraphBuilder extends Graph{    
	   public Graph GraphB() throws Exception{
	  //public static void main(String[] args) throws Exception{
	        Graph graph = new Graph();
	        InputToArr arr = new InputToArr();
	        ArrayList<Integer> nums = arr.Inputted();
	        
	        
	        //initialize some vertices and add them to the graph
	        Vertex[] vertices = new Vertex[234];
	        
	        //adds first index as a random number since array starts from 1 (for convenience)
	        vertices[0] = new Vertex("" + 100000);
            graph.addVertex(vertices[0], true);
            
	        for(int i = 1; i < vertices.length; i++){
	            vertices[i] = new Vertex("" + i);
	            graph.addVertex(vertices[i], true);
	        }
	        
	        
			for(int i = 1; i < vertices.length; i++){
				if(i - 8 >= 1 && i % 15 != 1)
				{
				graph.addEdge(vertices[i],vertices[i-8], nums.get(i-8));
				System.out.println("Vertex: "+vertices[i]+", "+vertices[i-8]+" Cost: "+nums.get(i-8)+"\n");
				}
				if(i - 7 >= 1 && i%15!=8)
				{
				graph.addEdge(vertices[i],vertices[i-7], nums.get(i-7));
				System.out.println("Vertex: "+vertices[i]+", "+vertices[i-7]+" Cost: "+nums.get(i-7)+"\n");
				}
				
				if(i - 15 >= 1)
				{
				graph.addEdge(vertices[i],vertices[i-15], nums.get(i-15));
				System.out.println("Vertex: "+vertices[i]+", "+vertices[i-15]+" Cost: "+nums.get(i-15)+"\n");
				}
				
				if(i + 7 <= 233 && i%15 != 1)
				{
				graph.addEdge(vertices[i],vertices[i+7], nums.get(i+7));
				System.out.println("Vertex: "+vertices[i]+", "+vertices[i+7]+" Cost: "+nums.get(i+7)+"\n");
				}
				
				if(i + 8 <= 233 && i%15 != 8)
				{
				graph.addEdge(vertices[i],vertices[i+8], nums.get(i+8));
				System.out.println("Vertex: "+vertices[i]+", "+vertices[i+8]+" Cost: "+nums.get(i+8)+"\n");
				}
				
				if(i + 15 <= 233)
				{
				graph.addEdge(vertices[i],vertices[i+15], nums.get(i+15));
				System.out.println("Vertex: "+vertices[i]+", "+vertices[i+15]+" Cost: "+nums.get(i+15)+"\n");
				}
				System.out.println(graph.vertexKeys());
				System.out.println(graph.getEdges());
			}
			return graph;
	    }

}
