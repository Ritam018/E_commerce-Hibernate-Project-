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
@Table(name="orders")
public class Orders {
//member variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderid")
	private int orderid;
	@Column(name="orderdate",length=20,nullable=false)
	private String orderdate;
	@Column(name="totalamount",length=20,nullable=false)
	private double totalamount;
	@ManyToOne
	@JoinColumn(name="usersid")
	private Users users;
		public Orders() {
			this.orderid=0;
			this.orderdate=null;
			this.totalamount=0;
			this.users=null;
			
		}
		public Orders(String orderdate, double totalamount, Users users) {
			super();
			this.orderdate = orderdate;
			this.totalamount = totalamount;
			this.users = users;
		}
		//getter and setter
		public int getOrderid() {
			return orderid;
		}
		public void setOrderid(int orderid) {
			this.orderid = orderid;
		}
		public String getOrderdate() {
			return orderdate;
		}
		public void setOrderdate(String orderdate) {
			this.orderdate = orderdate;
		}
		public double getTotalamount() {
			return totalamount;
		}
		public void setTotalamount(double totalamount) {
			this.totalamount = totalamount;
		}
		public Users getUsers() {
			return users;
		}
		public void setUsers(Users users) {
			this.users = users;
		}
		@Override
		public String toString() {
			return "Orders [orderid=" + orderid + ", orderdate=" + orderdate + ", totalamount=" + totalamount
					+ ", users=" + users + "]";
		}
		
}
		