import java.util.ArrayList;
import java.util.Stack;

public class Graph {
	public static void main(String[] args) {
		Node<String> A = new Node<String>("Server");
		Node<String> B = new Node<String>("Modem");
		Node<String> C = new Node<String>("Router");
		Node<String> D = new Node<String>("Switch");
		Node<String> E = new Node<String>("Device");

		A.setNeighbors(new Node[] { D, B });
		B.setNeighbors(new Node[] { C, C });
		C.setNeighbors(new Node[] { E, E });
		D.setNeighbors(new Node[] { E });
		A.setNeighbors(new Node[] { B, B, B });

		DFS(A);
		DFS(B);
		DFS(C);
		DFS(D);
	}

	// Depth First Search algorithm to identift uni and bi directional connections
	public static void DFS(Node start) {
		ArrayList<Node> visited = new ArrayList<Node>();
		Stack<Node> stack = new Stack<Node>();
		stack.push(start);

		while (!stack.empty()) {
			Node current = stack.pop();
			if (!visited.contains(current)) {
				System.out.print(current.getData() + ", ");
				visited.add(current);
				Node[] neighbors = current.getNeighbors();
				for (int i = neighbors.length - 1; i >= 0; i--) {
					stack.push(neighbors[i]);
				}
			}
		}

		System.out.println("");
	}
}