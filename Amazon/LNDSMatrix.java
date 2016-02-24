package Amazon;

import java.util.ArrayList;

public class LNDSMatrix {
	static int[][] matrix;

	static class Node {
		int row;
		int col;
		int val;
		ArrayList<Node> adjacent;

		public Node(int row, int col, int val) {
			this.row = row;
			this.col = col;
			this.val = val;
			this.adjacent = new ArrayList<Node>();

		}
	}

	public static void main(String[] args) {
		matrix = new int[][] { { 3, 1, 4, 6 }, { 5, 7, 9, 8 },
				{ 11, 15, 2, 12 } };
		Node[][] graph = new Node[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				Node temp = new Node(i, j, matrix[i][j]);
				graph[i][j] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0 && j == 0) {
					if (matrix[i][j] <= matrix[i + 1][j]) {
						graph[i][j].adjacent.add(graph[i + 1][j]);
					}
					if (matrix[i][j] <= matrix[i][j + 1]) {
						graph[i][j].adjacent.add(graph[i][j + 1]);
					}
					if (matrix[i][j] <= matrix[i + 1][j + 1]) {
						graph[i][j].adjacent.add(graph[i + 1][j + 1]);
					}
				} else if (i == 0) {
					if (matrix[i][j] <= matrix[i + 1][j]) {
						graph[i][j].adjacent.add(graph[i + 1][j]);
					}
					if (j + 1 < matrix[0].length
							&& matrix[i][j] <= matrix[i][j + 1]) {
						graph[i][j].adjacent.add(graph[i][j + 1]);
					}
					if (j + 1 < matrix[0].length
							&& matrix[i][j] <= matrix[i + 1][j + 1]) {
						graph[i][j].adjacent.add(graph[i + 1][j + 1]);
					}
					if (j - 1 >= 0 && matrix[i][j] <= matrix[i][j + 1]) {
						graph[i][j].adjacent.add(graph[i][j - 1]);
					}
					if (j - 1 >= 0 && matrix[i][j] <= matrix[i + 1][j - 1]) {
						graph[i][j].adjacent.add(graph[i + 1][j -   1]);
					}
				}
			}
		}
	}
}
