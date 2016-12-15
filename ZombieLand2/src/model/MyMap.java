package model;

/**
 * A class of map implying a width, a height and a grid coordinate
 */

public class MyMap {
	private int width;
	private int height;
	private int[][] grid;
	
	/**
	 * Initialize this new map as an array of arrays with a given width and a given height
	 * @param width
	 * 		  The width of this new map
	 * @param height
	 * 		  The height of this new map
	 * @param grid
	 * 		  the array of arrays representing this new map
	 */
	
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
