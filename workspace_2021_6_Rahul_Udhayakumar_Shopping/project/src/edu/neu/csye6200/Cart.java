package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private double myCash;
	private double myTotal;
	private double myChange;
	ArrayList<Item> list = new ArrayList<>();
	
	//Getters and Setters

	public double getMyCash() {
		return myCash;
	}


	public void setMyCash(double myCash) {
		this.myCash = myCash;
	}


	public double getMyTotal() {
		return myTotal;
	}


	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}


	public double getMyChange() {
		return myChange;
	}


	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}
	
	public List<Item> getItemList() {
		return list;
	}

	public void setItemList(ArrayList<Item> list) {
		this.list = list;
	}
	
	
	{
		this.myCash = 20;
		this.myTotal = 0;
		this.myChange = 0;
	}
	

	public Cart() {
		super();
		
	}


	public Cart(double myCash, double myTotal, double myChange) {
		super();
		this.myCash = myCash;
		this.myTotal = myTotal;
		this.myChange = myChange;
	}




	@Override
	public String toString() {
		 StringBuilder sb=new StringBuilder("\n\tCart");
		 sb.append("\n\tCash ").append(this.myCash).append("$");
		 sb.append("\n\tTotal ").append(this.myTotal).append("$");
		 sb.append("\n\tChange ").append(this.myChange).append("$");
		 
		 return sb.toString();
	}
	
    //sillyCheckout
	 public void sillyCheckout(double cash, double price, double cost, double change) {
		change=cash-cost;
		System.out.println("\nsillyCheckout OUTPUT ");

		System.out.println("\nCash: "+ cash+"$");
		System.out.println("\nTotal: "+ cost+"$");
		System.out.println("\nChange: "+ change+"$");

	 }
	 
	 
	 //checkout
	 public double checkout(Cart myCart, List<Item> myItems) {
		for(Item i: myItems) {
			myTotal=myTotal+(i.getPrice());
		}
		 myChange=myCash-myTotal;
		 System.out.println("\ncheckout OUTPUT ");

		 System.out.println("\nCash: "+ myCash+"$");
		 System.out.println("\nTotal: "+ myTotal+"$");
		 System.out.println("\nChange: "+ myChange+"$");

		 return myCart.getMyChange();
		 
	 }
	
	public static void demo() {
		
		Item apple=new Item(1,5.45,"Apple");
		Item banana=new Item(2,1.25,"Banana");
		Item orange=new Item(3,2.98,"Orange");

		List<Item> item = new ArrayList<>();
		item.add(apple);
		item.add(banana);	
		item.add(orange);
		
		double cash = 20.0, total=0, change=0;
		System.out.println("Bill");
		System.out.println("---------------------");
		System.out.println("Item \t Price");
		for(Item i: item) {
			total=total+(i.getPrice());
			System.out.println("\n"+i.getName()+" \t "+ i.getPrice()+"$");
		}

		
		double itemCost=total;
		
		Cart myShoppingCart=new Cart();
		myShoppingCart.sillyCheckout(cash,itemCost, total, change);
		myShoppingCart.checkout(myShoppingCart,item);
		
		System.out.println("\nOutput myShoppingCart");
		System.out.println(myShoppingCart);
		System.out.println("\nOutput myShoppingCart.toString());");
		System.out.println(myShoppingCart.toString());
		
		

	}
	
	

}
