import java.util.ArrayList;

public class Node<T> {
	private T data;
	private ArrayList<Node> neighbors;

	public Node(T d) {
		data = d;
		neighbors = new ArrayList<Node>();
	}

	public T getData() {
		return data;
	}

	public void setData(T d) {
		data = d;
	}

	public Node[] getNeighbors() {
		return neighbors.toArray(new Node[0]);
	}

	public void setNeighbors(Node[] d) {
		for (int i = 0; i < d.length; i++) {
			neighbors.add(d[i]);
		}
	}
}
