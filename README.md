
Project Overview
An ecommerce based hibernate project for proper management with the mentioned entities along with their mappings ,database connectivity and hibernate applications.
Entity details

Category Entity: ⟶ id (Primary Key, auto-generated) ⟶ name (Unique, Not Null) ⟶ description Relationship: One-to-Many with Product

Product Entity: ⟶ id (Primary Key, auto-generated) ⟶ name (Not Null) ⟶ price (Decimal, Not Null) ⟶ stockQuantity (Integer) Relationship: Many-to-One with Category

Users Entity: ⟶ id (Primary Key, auto-generated) ⟶ username (Unique, Not Null) ⟶ password (Hashed, Not Null) ⟶ email (Unique, Not Null) ⟶ role (ADMIN, CUSTOMER) Relationship: One-to-Many with Orders

Orders Entity: ⟶ id (Primary Key, auto-generated) ⟶ orderDate (Timestamp, Not Null) ⟶ totalAmount (Decimal, Not Null) Relationship: Many-to-One with Users, One-to-Many with OrderDetails

OrderDetails Entity: ⟶ id (Primary Key, auto-generated) ⟶ quantity (Integer, Not Null) ⟶ unitPrice (Decimal, Not Null) Relationship: Many-to-One with Orders, Many-to-One with Product

Technologies used

Java Hibernate MySQL Maven IDE (Eclipse or IntelliJ IDEA)

Tasks done in the project
Insert new Categories, Products, and Users ,Create Orders with multiple OrderDetails Fetch Orders along with associated Users and Products.Mappings and ORM are also established.
More to know
Java classes are annotated with JPA annotations like @Entity, @Table, @GeneratedValue, @Id, @OneToMany, and @ManyToOne to map objects to database tables. Relationships between entities (Users, Orders, Products) are handled using proper Hibernate mappings.
Project created by Ritam Sarkar
