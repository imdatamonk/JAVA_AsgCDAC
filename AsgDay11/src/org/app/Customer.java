package org.app;
import java.io.Serializable;
public class Customer implements Serializable{
	private String name,email,password,custType;
	private double amount;
	private static final long serialVersionUID = 2346471823333982197L;

	public Customer(String name, String email, String password, String custType, double amount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.custType = custType;
		this.amount = amount;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			System.out.println(this.email + "  " + obj);
			return this.email.equals(((Customer)obj).email);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Customer name=" + name + ", email=" + email + ", password=" + password
				+ ", custType=" + custType + ", amount=" + amount;
	}
}