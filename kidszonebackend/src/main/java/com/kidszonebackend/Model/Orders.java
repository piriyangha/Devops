package com.kidszonebackend.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Orders {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private int orderProductId;
		@OneToOne(fetch=FetchType.LAZY)
		private User user;
		@OneToOne
		private ShippingAddress shippingAddress;
		private Double orderPrice;
		private int orderQuantity;
		private String payMode;
		private long orderId;
		
		public int getOrderProductId() {
			return orderProductId;
		}
		public void setOrderProductId(int orderProductId) {
			this.orderProductId = orderProductId;
		}
		public ShippingAddress getShippingAddress() {
			return shippingAddress;
		}
		public void setShippingAddress(ShippingAddress shippingAddress) {
			this.shippingAddress = shippingAddress;
		}
		
		public Double getOrderPrice() {
			return orderPrice;
		}
		public void setOrderPrice(Double orderPrice) {
			this.orderPrice = orderPrice;
		}
		public int getOrderQuantity() {
			return orderQuantity;
		}
		public void setOrderQuantity(int orderQuantity) {
			this.orderQuantity = orderQuantity;
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPayMode() {
			return payMode;
		}
		public void setPayMode(String payMode) {
			this.payMode = payMode;
		}
		public long getOrderId() {
			return orderId;
		}
		public void setOrderId(long orderId) {
			this.orderId = orderId;
		}
		
	}


