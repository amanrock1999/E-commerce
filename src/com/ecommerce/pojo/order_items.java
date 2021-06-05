package com.ecommerce.pojo;

public class order_items {
	
	private int orderitemsId;
	private int productId;
	private int orderId;
	private int PrpductPrice;
	private int productQuantity;
	private int productDiscount;
	
	public order_items() {
		
	}
	
	public order_items(int orderitemsId, int productId, int orderId, int prpductPrice, int productQuantity,
			int productDiscount) {
		super();
		this.orderitemsId = orderitemsId;
		this.productId = productId;
		this.orderId = orderId;
		PrpductPrice = prpductPrice;
		this.productQuantity = productQuantity;
		this.productDiscount = productDiscount;
	}



	

	public int getOrderitemsId() {
		return orderitemsId;
	}



	public void setOrderitemsId(int orderitemsId) {
		this.orderitemsId = orderitemsId;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public int getPrpductPrice() {
		return PrpductPrice;
	}



	public void setPrpductPrice(int prpductPrice) {
		PrpductPrice = prpductPrice;
	}



	public int getProductQuantity() {
		return productQuantity;
	}



	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}



	public int getProductDiscount() {
		return productDiscount;
	}



	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}


}
