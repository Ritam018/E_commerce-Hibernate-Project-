package com.code.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product {
//member variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prodid")
	private int prodid;
	@Column(name="name",length=20,nullable=false,unique=true)
	private String name;
	@Column(name="price",nullable=false)
	private double price;
	@Column(name="stockquantity")
	private int stockquantity;
	//create a relationship with instructor
		//manytoone
		@ManyToOne
		@JoinColumn(name="catid")
		private Category category;
		public Product() {
			this.prodid=0;
			this.name=null;
			this.price=0;
			this.stockquantity=0;
			this.category=null;
		}
		public Product(String name, double price, int stockquantity, Category category) {
			super();
			this.name = name;
			this.price = price;
			this.stockquantity = stockquantity;
			this.category = category;
		}
		//getter and setter
		public int getProdid() {
			return prodid;
		}
		public void setProdid(int prodid) {
			this.prodid = prodid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getStockquantity() {
			return stockquantity;
		}
		public void setStockquantity(int stockquantity) {
			this.stockquantity = stockquantity;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		@Override
		public String toString() {
			return "Product [prodid=" + prodid + ", name=" + name + ", price=" + price + ", stockquantity="
					+ stockquantity + ", category=" + category + "]";
		}
		
}