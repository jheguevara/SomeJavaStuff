package part1;

import java.util.Date;

public class Order
{
	private int orderNumber = 5;
	private Date orderDate = new Date();
	private double listPrice = 13.05;
	private double sellingPrice = 10.44;
	private String notes;

	public String toString()
	{
		int orderNumber = 12;

		String s = "Order number: " + this.orderNumber + " Order date: "
				+ this.orderDate + " List price: " + this.listPrice
				+ " Selling price: " + this.sellingPrice;
		return s;
	}

	public static void main(String[] args)
	{
		Order o = new Order();
		String s = o.toString();
		System.out.println(s);
	}

}
