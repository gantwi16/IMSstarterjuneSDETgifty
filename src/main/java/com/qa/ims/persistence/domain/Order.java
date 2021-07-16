package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {

	private Long order_id;
	private String order_name;
	private String order_status;
	private String date_placed;
	private Float price;
	
	public Order(Long order_id, String order_name, String order_status, String date_placed, Float price) {
		super();
		this.order_id = order_id;
		this.order_name = order_name;
		this.order_status = order_status;
		this.date_placed = date_placed;
		this.price = price;
	}

	public Order(String order_name, String order_status, String date_placed, Float price) {
		super();
		this.order_name = order_name;
		this.order_status = order_status;
		this.date_placed = date_placed;
		this.price = price;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getDate_placed() {
		return date_placed;
	}

	public void setDate_placed(String date_placed) {
		this.date_placed = date_placed;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_name=" + order_name + ", order_status=" + order_status
				+ ", date_placed=" + date_placed + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date_placed, order_id, order_name, order_status, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(date_placed, other.date_placed) && Objects.equals(order_id, other.order_id)
				&& Objects.equals(order_name, other.order_name) && Objects.equals(order_status, other.order_status)
				&& Objects.equals(price, other.price);
	}
	
}
