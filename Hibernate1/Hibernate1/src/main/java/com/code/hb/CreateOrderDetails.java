package com.code.hb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.code.entity.OrderDetails;
import com.code.entity.Orders;
import com.code.entity.Product;
public class CreateOrderDetails {
private SessionFactory sessionFactory=null;
public CreateOrderDetails(SessionFactory sessionFactory)
{
	//set the Object
	this.sessionFactory=sessionFactory;
	//Session object using SessionFactory object
	Session session=sessionFactory.getCurrentSession();
	// start the transaction
	session.beginTransaction();
	//create object Instructor as well as
	int ordersid=1;
	Orders orders=session.get(Orders.class,ordersid);
	if(orders==null) {
		System.out.println("Sorry no record found with id"+ordersid);
		return;
	}
	
	System.out.println("Order Date:"+orders.getOrderdate());
	System.out.println("Total Amount:"+orders.getTotalamount());
	int prodid=1;
	Product product=session.get(Product.class,prodid);
	if(product==null) {
		System.out.println("Sorry no record found with id"+prodid);
		return;
	}
	
	System.out.println("Product Name:"+product.getName());
	System.out.println("Price:"+product.getPrice());
	System.out.println("Stock Quantity:"+product.getStockquantity());
	//OrderDetails
	OrderDetails orderdetails=new OrderDetails(2,80000,orders,product );
	//save the object
	session.persist(orderdetails);
	orderdetails =new OrderDetails(1,20000,orders,product);
//save the object
      session.persist(orderdetails);
     orderdetails=new OrderDetails(1,50000,orders,product);
//save the object
session.persist(orderdetails);

	//commit
	session.getTransaction().commit();
	//close the session
	session.close();
	//message
	System.out.println("OrderDetails are created successfully");
	
}
}

