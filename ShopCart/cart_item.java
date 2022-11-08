package net.codejava;

import java.text.DateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.text.SimpleDateFormat;

@Entity
public class cart_item {
	private Integer id;
	private Integer productId;
	private Integer cartid;
	private float price;
	private Integer quantity;
	private Integer active1;
	private DateFormat createdAt;
	private DateFormat updatedAt;

	public cart_item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cart_item(Integer id, Integer productId, Integer cartid, float price, Integer quantity, Integer active1,
			DateFormat createdAt, DateFormat updatedAt) {
		super();
		this.id = id;
		this.productId = productId;
		this.cartid = cartid;
		this.price = price;
		this.quantity = quantity;
		this.active1 = active1;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCartid() {
		return cartid;
	}

	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getActive1() {
		return active1;
	}

	public void setActive1(Integer active1) {
		this.active1 = active1;
	}

	public DateFormat getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateFormat createdAt) {
		this.createdAt = createdAt;
	}

	public DateFormat getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateFormat updatedAt) {
		this.updatedAt = updatedAt;
	}

}
