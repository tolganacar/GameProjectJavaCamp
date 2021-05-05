package Entities;

public class Game {
	private String gameName;
	private double price;
	private int stockAmount;
	private String category;
	
	public Game() {
		
	}
	
	public Game(String gameName, double price, int stockAmount, String category) {
		this.gameName = gameName;
		this.price = price;
		this.stockAmount = stockAmount;
		this.category = category;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
