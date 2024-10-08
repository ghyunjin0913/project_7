package springmvc.dto;

public class Customer {
	
	private int no;
	private String name;
	private String address;
	
	public Customer() {}
	public Customer(int no, String name, String address) {
		this.no = no;
		this.name = name;
		this.address = address;
	}
	
	public int getNo() { return no; }
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() { return address; }
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [no=" + no + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
