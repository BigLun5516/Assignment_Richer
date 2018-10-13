package block;

public abstract class Block {
	public  abstract String name();
	public abstract Block clone();
	public void setPosition(int r, int c){
		row = r;
		col = c;
	}
	public void setArround(int left, int right, int up, int down){
		this.left = left;
		this.right = right;
		this.up = up;
		this.down = down;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public int getLeft() {
		return left;
	}
	public int getRight() {
		return right;
	}
	public int getUp() {
		return up;
	}
	public int getDown() {
		return down;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}

	private int row;
	private int col;
	private int left;
	private int right;
	private int up;
	private int down;
	private int id = 1;
}
