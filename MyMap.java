package model;

public class MyMap {
	private int width;
	private int height;
	private int[][] grid;
	
	public MyMap(int x, int y) {
		this.width = x;
		this.height = y;
		this.grid = new int[x][y];
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int[][] getGrid() {
		return grid;
	}

	public void setGrid(int[][] grid) {
		this.grid = grid;
	}
	
	
}
