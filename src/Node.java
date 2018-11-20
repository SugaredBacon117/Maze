import java.util.ArrayList;

public class Node {

	private int value;
	private char color;
	private boolean isFinish;
	private ArrayList<Edge> edges;
	
	public Node(int v, char c) {
		value = v;
		color = c;
		isFinish = false;
		edges = new ArrayList<Edge>();
	}

	public boolean isFinish() {
		return isFinish;
	}

	public void setFinish(boolean isFinish) {
		this.isFinish = isFinish;
	}

	public int getValue() {
		return value;
	}

	public char getColor() {
		return color;
	}
	
	
	
}
