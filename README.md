# 🛒 Simple E-commerce System

Welcome to the Simple E-commerce System! This is a console-based shopping cart application built using Java. Users can browse products, add them to a cart, and complete a purchase. This project is designed to demonstrate fundamental Object-Oriented Programming (OOP) concepts and a basic shopping cart implementation.

## 📋 Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [OOP Concepts Demonstrated](#oop-concepts-demonstrated)
- [Setup and Usage](#setup-and-usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- Browse a list of products 🛍️
- Add products to a shopping cart 🛒
- View the contents of the shopping cart 👀
- Remove products from the shopping cart ❌
- Complete the purchase 💳

## 💻 Technologies

- Java
- Object-Oriented Programming (OOP) principles

## 🏗️ OOP Concepts Demonstrated

- **Classes and Objects**: Product, ShoppingCart, User, Order
- **Encapsulation**: Private fields with public getters and setters
- **Inheritance**: Base class for different types of products
- **Polymorphism**: Methods overriding and interface implementations
- **Abstraction**: Abstract classes and methods

## 🚀 Setup and Usage

1. **Clone the repository**:
   ```sh
   git clone https://github.com/krupaliChotaliya/CodeClauseInternship_EcommerceShoppingCart.git
   cd simple-ecommerce-system
   ```

2. **Compile the project**:
   ```sh
   javac -d bin src/*.java
   ```

3. **Run the application**:
   ```sh
   java -cp bin Main
   ```

4. **Interact with the application**:
   - Follow the console prompts to browse products, add them to your cart, view your cart, and complete the purchase.

## 📁 Project Structure

```
simple-ecommerce-system/
│
├── src/
│   ├── Main.java             # Entry point of the application
│   ├── Product.java          # Product class
│   ├── ShoppingCart.java     # Shopping cart class
│   ├── User.java             # User class
│   ├── Order.java            # Order class
│   └── ...                   # Additional classes
│
├── bin/                      # Compiled classes
│
├── README.md                 # Project README file
│
└── LICENSE                   # Project license
