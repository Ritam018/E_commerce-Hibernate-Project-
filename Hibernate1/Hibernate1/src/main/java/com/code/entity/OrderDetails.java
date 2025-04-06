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
@Table(name="orderdetails")
public class OrderDetails {
//member variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="odid")
	private int odid;
	@Column(name="quantity",length=20,nullable=false)
	private int quantity;
	@Column(name="unitprice",length=20,nullable=false)
	private double unitprice;
    @ManyToOne
	@JoinColumn(name="ordersid")
    private Orders orders;
    @ManyToOne
    @JoinColumn(name="prodid")
    private Product product;
		public OrderDetails () {
			this.odid=0;
			this.quantity=0;
			this.unitprice=0;
			this.orders=null;
			this.product=null;
		}
		public OrderDetails(int quantity, double unitprice, Orders orders, Product product) {
			super();
			this.quantity = quantity;
			this.unitprice = unitprice;
			this.orders = orders;
			this.product = product;
		}
		//getter and setter
		public int getOdid() {
			return odid;
		}
		public void setOdid(int odid) {
			this.odid = odid;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getUnitprice() {
			return unitprice;
		}
		public void setUnitprice(double unitprice) {
			this.unitprice = unitprice;
		}
		public Orders getOrders() {
			return orders;
		}
		public void setOrders(Orders orders) {
			this.orders = orders;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		@Override
		public String toString() {
			return "OrderDetails [odid=" + odid + ", quantity=" + quantity + ", unitprice=" + unitprice + ", orders="
					+ orders + ", product=" + product + "]";
		}
	
}