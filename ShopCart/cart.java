package net.codejava;

import java.text.DateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.text.SimpleDateFormat;

@Entity
public class cart {
	private Integer id;
	private String userid;
	private String sessionId;
	private String token;
	private String status1;
	private String firstName;
	private String lastName;
	private DateFormat createdAt;
	private DateFormat updatedAt;

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cart(Integer id, String userid, String sessionId, String token, String status1, String firstName,
			String lastName, DateFormat createdAt, DateFormat updatedAt) {
		super();
		this.id = id;
		this.userid = userid;
		this.sessionId = sessionId;
		this.token = token;
		this.status1 = status1;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus1() {
		return status1;
	}

	public void setStatus1(String status1) {
		this.status1 = status1;
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
