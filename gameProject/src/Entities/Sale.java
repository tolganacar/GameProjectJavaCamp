package Entities;

public class Sale {
	private int id;
	private int playerId;
	private int gamePrice;
	private int amount;
	
	public Sale() {
		
	}
	
	public Sale(int id, int playerId, int gamePrice, int amount) {
		this.id = id;
		this.playerId = playerId;
		this.gamePrice = gamePrice;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
