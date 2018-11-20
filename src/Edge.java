
public class Edge {

	private Node start;
	private Node end;
	private char color;
	
	public Edge(Node s, Node e, char c) {
		start = s;
		end = e;
		color = c;
	}

	public Node getStart() {
		return start;
	}

	public Node getEnd() {
		return end;
	}

	public char getColor() {
		return color;
	}

}
