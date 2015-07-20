package com.lghuntfor.lucene.entity;

import java.io.Serializable;

import com.lghuntfor.lucene.annotation.Searchable;
import com.lghuntfor.lucene.annotation.SearchableId;
import com.lghuntfor.lucene.enums.Index;
import com.lghuntfor.lucene.enums.Store;

@Searchable(alias="user")
public class User implements Serializable {
	private static final long serialVersionUID = 6587804352897768224L;
	
	@SearchableId(name="id", store=Store.YES, index=Index.NOT_ANALYZED)
	private Integer id;
	
	@SearchableId(name="username", store=Store.YES, index=Index.NOT_ANALYZED)
	private String username;
	
	@SearchableId(name="password", store=Store.NO, index=Index.NOT_ANALYZED)
	private String password;
	
	@SearchableId(name="email", store=Store.YES, index=Index.NOT_ANALYZED)
	private String email;
	
	@SearchableId(name="phone", store=Store.YES, index=Index.NOT_ANALYZED)
	private String phone;
	
	public User() {
		super();
	}

	public User(Integer id, String username, String password, String email, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", id=" + id + "]";
	}
	
}
