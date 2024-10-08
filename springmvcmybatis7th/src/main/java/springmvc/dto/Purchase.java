package springmvc.dto;

public class Purchase {

	private int pno;
	private String pname;
	private int quantity;
	private int price;
	private int no;
	
	public Purchase() {}
	public Purchase(int pno, String pname, int quantity, int price, int no) {
		this.pno = pno;
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.no = no;
	}
	
	public int getPno() { return pno; }
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() { return pname; }
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() { return quantity; }
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() { return price; }
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNo() { return no; }
	public void setNo(int no) {
		this.no = no;
	}
	
	
}
