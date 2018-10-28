package block;

public abstract class Block {
	public  abstract String name();
	public abstract Block clone();
	public void setPosition(int r, int c){
		row = r;
		col = c;
	}

	private int row;
	private int col;
	private int id;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

}
