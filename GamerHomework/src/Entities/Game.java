package Entities;

public class Game implements Entity {
	private int gameId;
	private String gameName;
	private double unitPrice;
	

	public Game() {

	}

	public Game(int gameId, String gameName, double unitPrice) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
