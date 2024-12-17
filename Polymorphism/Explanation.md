# Polymorphism in Object-Oriented Programming

## Introduction

Polymorphism is one of the four fundamental principles of Object-Oriented Programming (OOP). It enables objects of different classes to be treated as objects of a common superclass. This is primarily achieved through **method overriding** and **method overloading**, allowing a single interface to represent different behaviors.

---

## What is Polymorphism?

**Polymorphism** means "many forms." In OOP, it allows the same function or method to behave differently based on the object it is acting upon. There are two main types:

1. **Compile-Time Polymorphism** (Static Binding):  
   Achieved through method overloading or operator overloading.  
   Example: Multiple methods with the same name but different parameter lists.

2. **Run-Time Polymorphism** (Dynamic Binding):  
   Achieved through method overriding, where a subclass provides a specific implementation of a method defined in its parent class.

---

## Types of Polymorphism in Java

### 1. **Compile-Time Polymorphism**:
- Achieved using **method overloading**.
- The method to be executed is determined at compile-time.

Example:
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

### 2. **Run-Time Polymorphism**:
- Achieved using **method overriding**.
- The method to be executed is determined at runtime based on the object type.

Example:
```java
class Publication {
    void saleCopy() {
        System.out.println("Sale of generic publication.");
    }
}

class Book extends Publication {
    @Override
    void saleCopy() {
        System.out.println("Sale of a book.");
    }
}

class Magazine extends Publication {
    @Override
    void saleCopy() {
        System.out.println("Sale of a magazine.");
    }
}
```

---

## Real-World Scenario for Polymorphism

### Problem Statement:

In this assignment, we explore the concept of polymorphism by modeling the relationships between **Publication**, **Book**, and **Magazine** classes. Here's a breakdown:

- **Commonalities**:
  - Instance Variables: `Title`, `Price`, `Copies`.
  - Method: `saleCopy()`.

- **Differences**:
  - **Book**:
    - Additional Variable: `Author`.
    - Method: `orderCopies()`.
  - **Magazine**:
    - Additional Variables: `OrderQty`, `CurrentIssue`.
    - Method: `receiveIssue()`.

### Objective:

The program calculates the total copies ordered and the total sale for all publications.

---

## Key Advantages of Polymorphism

1. **Code Reusability**:  
   Promotes writing generalized code that works for different object types.
   
2. **Extensibility**:  
   Adding new types (e.g., new subclasses like "Journal") does not require changing existing code.
   
3. **Simplifies Code Maintenance**:  
   Reduces redundancy and ensures consistency.

---

## Example Use Case

Here's a general workflow for this assignment:

1. Create a base class `Publication` with the common attributes and methods.
2. Extend the base class into two subclasses:
   - `Book`: Includes specific properties and methods for books.
   - `Magazine`: Includes specific properties and methods for magazines.
3. Override the `saleCopy()` method in both subclasses to demonstrate polymorphism.
4. Implement methods to calculate:
   - Total copies ordered.
   - Total sales of all publications.

---

## Expected Viva Questions

1. What is polymorphism, and why is it important in OOP?
2. Differentiate between compile-time and runtime polymorphism.
3. How is method overriding related to polymorphism?
4. Can constructors be overridden? Why or why not?
5. Explain the differences between method overloading and method overriding with examples.
6. What are the advantages of polymorphism in real-world applications?
7. How does polymorphism improve code maintainability and flexibility?
8. How would you extend the current system to add another type of publication, e.g., `Journal`?
9. Can polymorphism be achieved without inheritance in Java?
10. What happens if the `saleCopy()` method is not overridden in the subclass?

---

By exploring this assignment, you’ll gain a deeper understanding of polymorphism and its application in designing flexible and reusable code structures in Java.