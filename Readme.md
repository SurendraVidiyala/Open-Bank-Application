Open Bank Application (24-06-2018)
==================================

A Java web application based on the standard servlet spec. The application provides a RESTful API that retrieves transactions from OpenBank sandbox and transforms the data.

#3 API endpoints:

[1] Fetch all the transactions and map them 
 
```
http://localhost:8080/api/v1/listAllTransactions
```

[2] Fetch transactions based on transaction type filter 

```
http://localhost:8080/api/v1/listAllTransactions/{transactionType}
```

[3] Calculate the total amount for transaction type
 
```
http://localhost:8080/api/v1/totalAmount/{transactionType}
```

# Technologies used:

•	Java 8

•	Spring MVC
 
•	Maven 4.0.0
 
# Editor used to build Web Service application:

•	Spring Tool Suite V3.9.4

# Future Scope:

•	Use of Apache Camel to route the web service call

•	Secure the page with Spring security

# Features not included:

•	Fetch transactions based on transaction type filter

•	Calculate the total amount for transaction type

•	Enable Logging and Exception handling