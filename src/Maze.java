import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Maze {

	// graph variables
	private Graph mazeGraph;
	private static Point[][] adjMtx;
	private int nodeNum = 0;
	// file IO
	private String inputFile;
	private String outputFile;
	
	public Maze() {
		mazeGraph = new Graph();
		
		initialize();
		
		adjMtx = new Point[nodeNum][nodeNum];	// initialize after file IO
	}
	
	// function reads input file and initializes graphs and whatnot
	public void initialize() throws FileNotFoundException {
		FileReader f = new FileReader("data/" + inputFile);
		Scanner s = new Scanner(f);
	}
	
	public static void main(String[] args) {
		Maze maze = new Maze();
	}
}
