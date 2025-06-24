# 🏦 Bank Management System - Spring Boot Project

This is a **Bank Management System** built using **Spring Boot** and **MySQL** that performs full **CRUD operations** on bank accounts. The project provides a simple RESTful API to manage bank accounts, including functionalities like creating an account, fetching details, depositing, withdrawing, and closing accounts.

## 📌 Features

- Create a new bank account
- Fetch account details by account number
- Deposit money to an account
- Withdraw money from an account
- Delete/close an account
- MySQL integration for persistent data storage
- Postman API tool used for testing endpoints

## 🔧 Tech Stack

- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **Build Tool:** Maven
- **API Testing:** Postman
- **IDE:** Eclipse

## 🗃️ Database Schema

Database: `bank_management`

Table: `account`
```sql
CREATE TABLE account (
 +---------------------+--------------+------+-----+---------+----------------+
| Field               | Type         | Null | Key | Default | Extra          |
+---------------------+--------------+------+-----+---------+----------------+
| account_number      | bigint       | NO   | PRI | NULL    | auto_increment |
| account_balance     | double       | YES  |     | NULL    |                |
| account_holder_name | varchar(255) | YES  |     | NULL    |                |
+---------------------+--------------+------+-----+---------+----------------+
);



