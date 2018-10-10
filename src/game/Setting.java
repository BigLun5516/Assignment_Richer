package game;
/*
 * 游戏设置
 */
public class Setting {
	private int volum = 50;
	private int players = 2;
	private String resolution = "1024*768";
	public int getVolum() {
		return volum;
	}
	public void setVolum(int volum) {
		this.volum = volum;
	}
	public int getPlayers() {
		return players;
	}
	public void setPlayers(int players) {
		this.players = players;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
}
