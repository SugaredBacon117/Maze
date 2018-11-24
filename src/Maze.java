import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Maze {

	// graph variables
	private static Pair[][] adjMtx;
	private static int numNodes;
	private static int numEdges;
	private static int rocketStart;
	private static int luckyStart;
	private static String[] nodes;
	private static Map<Point, Character> edges;
	
	// file IO
	private static String inputFile;
	private static String outputFile;
	
	public Maze() {
		try {
			initialize();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// function reads input file and initializes graphs and whatnot
	public static void initialize() throws FileNotFoundException {
		FileReader f = new FileReader("input1.txt");
		Scanner s = new Scanner(f);
		
		numNodes = Integer.parseInt(s.next());
		numEdges = Integer.parseInt(s.next());
		s.nextLine();
		
		String line = s.nextLine();
		nodes = line.split(" ");
		
		adjMtx = new Pair[numNodes][numNodes];
		
		rocketStart = Integer.parseInt(s.next());
		luckyStart = Integer.parseInt(s.next());
		
		int edge1 = s.nextInt() - 1;
		int edge2 = s.nextInt() - 1;
		while(s.hasNextLine()) {
			for(int i = 0; i < numNodes; i++) {
				for(int j = 0; j < numNodes; j++) {
					if(i == edge1 && j ==edge2) {
						adjMtx[i][j] = new Pair(nodes[i].charAt(0), s.next().charAt(0));
						edge1 = s.nextInt() - 1;
						edge2 = s.nextInt() - 1;
					} else {
						adjMtx[i][j] = new Pair(nodes[i].charAt(0), 'N');
					}
				}
			}
		}
	}
	
	public static Pair[][] getAdjMtx() {
		return adjMtx;
	}

	public int getNumNodes() {
		return numNodes;
	}

	public int getNumEdges() {
		return numEdges;
	}

	public int getRocketStart() {
		return rocketStart;
	}

	public int getLuckyStart() {
		return luckyStart;
	}

	public String[] getNodes() {
		return nodes;
	}

	public Map<Point, Character> getEdges() {
		return edges;
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public static void main(String[] args) {
		Maze maze = new Maze();
		maze.setInputFile("input1.txt");
		
		for(int i = 0; i < maze.getNumNodes(); i++) {
			for(int j = 0; j < maze.getNumNodes(); j++) {
				System.out.println(maze.getAdjMtx()[i][j]);
			}
		}
	}
}
