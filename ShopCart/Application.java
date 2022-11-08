package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	// creates new items with product name, quantity and unit price
    cart_item i1 = new cart_item();

    
    ShoppingCart cart = new ShoppingCart();
    
    /* add the item to the cart */
    cart.addToCart(i1);
    
    cart.showCart();
    
    /* remove the item sent as argument from the cart */
    cart.removeFromCart(i1);    
    
    /*
     * shows the list of items in the cart with quantity

     */
    cart.showCart();

    /*
     * gets the total amount for the items in the cart
     * Expected Output:
     * 1100
     */
    double totalAmount = cart.getTotalAmount();
    System.out.println(totalAmount);


    cart.printInvoice();

    cart.addToCart(new cart_item();
    /* 
     * print the items with the quanity, unit price, total amount
     * apply coupon if valid 
     * add tax to the total amount after discount

     */
    cart.printInvoice();
}
