package edu.neu.csye6200;


public class Item {

	private int id;
	private String Name;
	private double Price;
	
	public Item() {
		super();
	
	}

	public Item(int id, double price, String name) {
		super();
		this.id = id;
		this.Name = name;
		this.Price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", Name=" + Name + ", Price=" + Price + "]";
	}
	

}
