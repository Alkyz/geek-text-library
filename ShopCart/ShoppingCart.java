package net.codejava;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
	ArrayList<cart_item> item;
	double totalAmount;
	String coupon;
	ShoppingCart() {
		this.item = new ArrayList<cart_item>();
		this.coupon = "";
		this.totalAmount = 0;
	}
	public void addToCart(cart_item item) {
		this.item.add(item);
	}
	public void showCart() {
		ListIterator<cart_item> iterator = item.listIterator();
		while(iterator.hasNext()) {
			cart_item item1 = iterator.next();
			System.out.println(item1);
		}
	}
	public void removeFromCart(cart_item i) {
		ListIterator<cart_item> iterator1 = item.listIterator();
		while(iterator1.hasNext()) {
			cart_item item2 = iterator1.next();
			if (item2.getProductId().equals(i.getProductId())) {
				this.item.remove(i);
				break;
			}
		}
	}
	public double getTotalAmount() {
		ListIterator<cart_item> iterator2 = item.listIterator();
		this.totalAmount = 0;
		while(iterator2.hasNext()) {
			cart_item item3 = iterator2.next();
			this.totalAmount = this.totalAmount + (item3.getPrice() * item3.getQuantity());
		}
		return this.totalAmount;
	}
	public void printInvoice() {
		ListIterator<cart_item> iterator3 = item.listIterator();
		while(iterator3.hasNext()) {
			cart_item item4 = iterator3.next();
			System.out.print(item4.getProductId() + "\t");
			System.out.print(item4.getQuantity() + "\t");
			System.out.print(item4.getPrice() + "\t");
			System.out.println(item4.getPrice() * item4.getQuantity());
		}
		System.out.println("\t\t\t" + "Total    : " + this.getTotalAmount());
	}
}