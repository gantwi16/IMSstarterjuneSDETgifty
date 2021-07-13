package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {

		private Long itemID;
		private String itemName;
		private Float price;
		
		public Item(String itemName, Float price) {
			this.setItemName(itemName);
			this.setPrice(price);
		}
		
		public Item(Long itemID, String itemName, Float price) {
			this.setId(itemID);
			this.setItemName(itemName);
			this.setPrice(price);
		}
		
		public Long getitemID() {
			return itemID;
		}
		
		public void setId(Long itemID) {
			this.itemID = itemID;
		}
		
		public String getItemName() {
			return itemName;
		}
		
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		
		public Float price() {
			return price;
		}
		
		public void setPrice(Float price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "item id: " + itemID + ", item name: " + itemName + ", price: " + price + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(itemID, itemName, price);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			return Objects.equals(itemID, other.itemID) && Objects.equals(itemName, other.itemName)
					&& Objects.equals(price, other.price);
		}
		
		
		
}
