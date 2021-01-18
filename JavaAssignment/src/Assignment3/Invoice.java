package Assignment3;

public class Invoice implements Payable{
	String partNum;
	String partDescription;
	int quantity;
	double pricePerItem;
	
	
	public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	
	@Override
	public double getPaymentAmount(float rate) {
		
		return pricePerItem*rate;
	}
	
}
