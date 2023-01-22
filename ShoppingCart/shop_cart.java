package net.ShopCart;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Random;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class shop_cart {
	private Integer id;
	private String userId;
	private String status1;
	private String first_name;
	private String last_name;
	private String session_id;

	public shop_cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public shop_cart(Integer id, String userId, String session_id, String status1, String first_name,
			String last_name) {
		super();
		this.id = id;
		this.userId = userId;
		this.session_id = session_id;
		this.status1 = status1;
		this.first_name = first_name;
		this.last_name = last_name;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return userId;
	}

	public void setUserid(String userid) {
		this.userId = userid;
	}

	public String getSessionId() {
		Random r = new Random();

	    String alphabet = "123xyz";
	    for (int i = 0; i < 10; i++) {
	        session_id += (alphabet.charAt(r.nextInt(alphabet.length())));
	    }
		return session_id;
	}

	public void setSessionId(String session_id) {


		this.session_id = session_id;
	}

	public String getStatus1() {
		status1 = "Y" ;
		return status1;
	}

	public void setStatus1(String status1) {
		this.status1 = status1;
	}

	public String getFirstName() {
		
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getLastName() {
		
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	

}
