package Entities;

public class Player {
	private int id;
	private String firstName;
	private String lastName;
	private String birthYear;
	private String tcNo;
	
	public Player() {
		
	}
	
	public Player(int id,String firstName, String lastName, String birthYear, String tcNo) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.tcNo = tcNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	
	
}
