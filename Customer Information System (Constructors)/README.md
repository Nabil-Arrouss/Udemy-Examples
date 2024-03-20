# Customer Information System

This Java program demonstrates the use of constructors and constructor chaining in the `Customer` class to create customer objects with different sets of parameters.

## Main Class

The `Main` class contains the `main` method, which demonstrates the creation of customer objects with different constructors. It shows how arguments are passed to constructors and how getter methods are used to retrieve customer information.

## Customer Class

The `Customer` class represents a customer and includes instance fields for name, credit limit, and email address. It includes multiple constructors with different parameter sets:

1. Constructor with parameters `(name, creditLimit, emailAddress)`: Initializes the instance fields with the provided arguments.
2. Constructor with parameters `(name, emailAddress)`: Calls the constructor with three parameters, providing a default credit limit.
3. Constructor with no parameters: Calls the constructor with two parameters, providing default values for name and email address.

The class also includes getter methods to retrieve customer information.