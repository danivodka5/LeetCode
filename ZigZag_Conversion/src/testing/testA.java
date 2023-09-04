package testing;

import java.util.ArrayList;

public class testA {

	public static void main(String[] args) {
			
		int altura = 3;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>(altura);
		
		for(int i=0; i < altura; i++) {
		    graph.add(new ArrayList());
		}
		
		graph.get(0).add(1);
		graph.get(1).add(2);
		graph.get(2).add(0);
		
		graph.get(1).add(0);
		graph.get(2).add(1);
		graph.get(0).add(2);
		
		int vertexCount = graph.size();
		for (int i = 0; i < vertexCount; i++) {
		    int edgeCount = graph.get(i).size();
		    for (int j = 0; j < edgeCount; j++) {
		        int startVertex = i;
		        int endVertex = graph.get(i).get(j);
		        System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
		    }
		}
		
	}
}
