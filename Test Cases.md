Test Cases according to different types of files in the project.
This file contains test cases to verify the project structure in hibernate1.

Test Case 1: Create a New User
Description: Add a new user to the system.

Input:

username: Priya
password: priaabcd123
email: priya4567@gmail.com
role: CUSTOMER
Expected Output:

User is successfully inserted into the database.
Likewise the other tables are also created into the database.
The user has a unique ID generated.
Password is stored in hashed format using BCrypt.
 Test Case 2: Insert a New Product
Description: Adding a product into the store.

Input:

name: Washing Machine
price: 40000
stockQuantity: 100
Expected Output:
Likewise all the three products are created and after that a message is shown as below-
Products are created successfully.
All the other insertions are done likely.
Test Case 3: To read the fetch file and to clear about the orderdetails.
Input:

User (must already exist):

id: 1
Product (must already exist):

Order ID: 1
User Name: Priya
Product Name: Washing machine
Quantity: 1
Unit Price: 40000.0