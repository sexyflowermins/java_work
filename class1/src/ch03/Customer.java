package ch03;

public class Customer {

	private int id;
	private String name;
	private String email;
	private String phone;
	Coffee[] orders = new Coffee[5];
	
	public Customer(int id, String name, String email, String phone, String[] list) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	
	
}
