package Pekan9_2511531013;
import java.util.*;

public class GraphTraversal_2511531013{
	private Map<String, List<String>> graph = new HashMap<>();
	// Menambahkan edge (graf tak berarah)
	public void addEdge (String node1_1013, String node2_1013) {
		graph.putIfAbsent (node1_1013, new ArrayList<>());
		graph.putIfAbsent (node2_1013, new ArrayList<>());
		graph.get (node1_1013).add(node2_1013);
		graph.get(node2_1013).add(node1_1013);
	}
	// Menampilkan graf awal
	public void printGraph() {
		System. out.println("Graf Awal (Adjacency List):");
		for (String node :graph.keySet()) {
				System.out.print (node +"->");
				List<String> neighbors = graph.get(node);
				System.out.println(String.join("，", neighbors));
		}
		System.out.println();
	}
	// DFS rekursif
	public void dfs(String start) {
		Set<String> visited = new HashSet<>();
		System. out.println("Penelusuran DFS:");
		dfsHelper(start, visited);
		System.out.println();
	}
	private void dfsHelper(String current, Set<String> visited) {
		if (visited.contains (current)) return;
		visited. add(current);
		System. out.print(current +" ");
		for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
			dfsHelper(neighbor, visited);
		}
	}
	public void bfs(String start) {
	    Set<String> visited = new HashSet<>();
	    Queue<String> queue = new LinkedList<>();

	    queue.add(start);
	    visited.add(start);

	    System.out.println("Penelusuran BFS:");

	    while (!queue.isEmpty()) {
	        String current = queue.poll();

	        System.out.print(current + " ");

	        for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
	            if (!visited.contains(neighbor)) {
	                queue.add(neighbor);
	                visited.add(neighbor);
	            }
	        }
	    }

	    System.out.println();
	}
	// main
    public static void main(String[] args) {

        GraphTraversal_2511531013 graph = new GraphTraversal_2511531013();

        // Membuat graf
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");
        //Cetak graf awal
        System.out.println("Graf Awal Adalah: ");
        graph.printGraph();
        //Lakukan penelusuran
        graph.dfs("A");
        graph.bfs("A");
}
}