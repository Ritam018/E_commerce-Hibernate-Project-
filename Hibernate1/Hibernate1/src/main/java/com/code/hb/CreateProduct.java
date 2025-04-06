package com.code.hb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.code.entity.Category;
import com.code.entity.Product;
public class CreateProduct {
private SessionFactory sessionFactory=null;
public CreateProduct(SessionFactory sessionFactory)
{
	//set the Object
	this.sessionFactory=sessionFactory;
	//Session object using SessionFactory object
	Session session=sessionFactory.getCurrentSession();
	// start the transaction
	session.beginTransaction();
	 Category category1 = session.createQuery("FROM Category WHERE name = 'Electronics'", Category.class).uniqueResult();
     if (category1 == null) {
         category1 = new Category();
         category1.setName("Electronics");
         category1.setDescription("Devices and gadgets");
         session.persist(category1);
         System.out.println("New category 'Electronics' created successfully!");
     }

     Category category2 = session.createQuery("FROM Category WHERE name = 'Personal Care'", Category.class).uniqueResult();
     if (category2 == null) {
         category2 = new Category();
         category2.setName("Personal Care");
         category2.setDescription("Self-care items");
         session.persist(category2);
         System.out.println("New category 'Personal Care' created successfully!");
     }

     Category category3 = session.createQuery("FROM Category WHERE name = 'Appliances'", Category.class).uniqueResult();
     if (category3 == null) {
         category3 = new Category();
         category3.setName("Appliances");
         category3.setDescription("Home appliances");
         session.persist(category3);
         System.out.println("New category 'Appliances' created successfully!");
     }

    
	//Product
	Product product=new Product("Washing machine",40000,100, category1);	
	//save the object
	session.persist(product);
	product =new Product("Shampoo",2000,50,category2);
//save the object
      session.persist(product);
     product=new Product("TV",50000,200,category3);
//save the object
session.persist(product);

	//commit
	session.getTransaction().commit();
	//close the session
	session.close();
	//message
	System.out.println("Products are created successfully");
	
}
}

