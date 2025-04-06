package com.code.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="category")
public class Category {
//member variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="catid")
	private int catid;
	@Column(name="name",length=20,nullable=false,unique=true)
	private String name;
	@Column(name="description",length=255,nullable=false)
	private String description;	
		public Category () {
			this.catid=0;
			this.name=null;
			this.description=null;
			
		}
		public Category(String name, String description) {
			super();
			this.name = name;
			this.description = description;
			
		}
		
		//getter and setter
		public int getCatid() {
			return catid;
		}
		public void setCatid(int catid) {
			this.catid = catid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		@Override
		public String toString() {
			return "Category [catid=" + catid + ", name=" + name + ", description=" + description + "]";
		}
}