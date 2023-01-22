package net.ShopCart;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class shop_cart_item {
	private Integer id;
	private Integer product_id;
	private Integer cartId;
	private float price;
	private Integer quantity;
	private String book;


	public shop_cart_item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public shop_cart_item(Integer id, Integer product_id, Integer cartId, float price, Integer quantity, String book) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.cartId = cartId;
		this.price = price;
		this.quantity = quantity;
		this.book = book;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return product_id;
	}

	public void setProductId(Integer productId) {
		this.product_id = productId;
	}

	public Integer getCartid() {
		return cartId;
	}

	public void setCartid(Integer cartid) {
		this.cartId = cartid;
	}

	public float getPrice() {
		
		if(product_id == 111111) {
		price = 20;
		}
		if(product_id == 5667932) {
			price = 10;
			}
		if(product_id == 874592875) {
			price = 15;
			}
		if(product_id == 2147483647) {
			price = 20;
			}
		if(product_id == 2097502) {
			price = 17;
			}
		if(product_id == 8717134) {
			price = 15;
			}
		if(product_id == 8927542) {
			price = 5;
			}
		if(product_id == 27590424) {
			price = 30;
			}
		if(product_id == 27850289) {
			price = 43;
			}
		if(product_id == 798527037) {
			price = 45;
			}
		
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getQuantity() {

		if(product_id == 111111) {
			quantity = 15 ;
			quantity--;
			}
		
			if(product_id == 5667932) {
				quantity = 21; 
				quantity--;

				}
			if(product_id == 874592875) {
				quantity = 13;
				quantity--;

				}
			if(product_id == 2147483647) {
				quantity = 5;
				quantity--;

				}
			if(product_id == 2097502) {
				quantity = 10;
				quantity--;

				}
			if(product_id == 8717134) {
				quantity = 30;
				quantity--;

				}
			if(product_id == 8927542) {
				quantity = 49;
				quantity--;

				}
			if(product_id == 27590424) {
				quantity = 21;
				quantity--;

				}
			if(product_id == 27850289) {
				quantity = 50;
				quantity--;

				}
			if(product_id == 798527037) {
				quantity = 51;
				quantity--;

				}
			if(product_id == 798527037) {
				quantity = 9;
				quantity--;

				}
			
			
		return quantity;

	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getBook() {
		
		if(product_id == 111111) {
			book = "SQL";
			}
			if(product_id == 5667932) {
				book = "Prog";
				}
			if(product_id == 874592875) {
				book = "November 9";
				}
			if(product_id == 2147483647) {
				book = "Cthulu";
				}
			if(product_id == 2097502) {
				book = "The Maidens";
				}
			if(product_id == 8717134) {
				book = "How to get rid of a man in 10 days";
				}
			if(product_id == 8927542) {
				book = "Dictionary";
				}
			if(product_id == 27590424) {
				book = "Harry Potter and the Sorcerers";
				}
			if(product_id == 27850289) {
				book = "Keyboards love";
				}
			if(product_id == 798527037) {
				book = "Amazon Prime For Dummies";
				}
			
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}


	

}
