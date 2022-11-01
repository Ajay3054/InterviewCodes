package com.java8.streamapi;

public class Insurance {

	private int id;
	private int amount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Insurance(int id, int amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Insurance [id=" + id + ", amount=" + amount + "]";
	}
	
	
	
}
