# Problem Statement: Classes and Objects in Java

## Title: 
Classes and Objects

## Problem Statement:
Design a class `Complex` to represent complex numbers. The class should have data members to store the **real** and **imaginary** parts of the complex number. Implement both **default** and **parameterized constructors** to initialize the complex number.

### Task:
1. Define the class `Complex` with the following data members:
   - `real` (type: double) to store the real part of the complex number.
   - `imag` (type: double) to store the imaginary part of the complex number.

2. Implement the **default constructor** that initializes both `real` and `imag` to 0.

3. Implement the **parameterized constructor** that allows initialization of `real` and `imag` with specific values.

4. Implement methods to perform **arithmetic operations** between two complex numbers, including:
   - **Addition**: Add two complex numbers.
   - **Subtraction**: Subtract two complex numbers.
   - **Multiplication**: Multiply two complex numbers.
   - **Division**: Divide one complex number by another.

5. Each arithmetic operation should return the result as a new `Complex` object.

### Input:
- Two complex numbers:
  - Complex number 1: `c1 = a + ib`
  - Complex number 2: `c2 = c + id`
  
### Output:
- Output the result of the arithmetic operations:
  - Sum of `c1` and `c2`
  - Difference of `c1` and `c2`
  - Product of `c1` and `c2`
  - Quotient of `c1` and `c2`

### Objectives:
- To understand the concept of **classes** and **objects** in Java.
- To learn about **constructors**, including **default** and **parameterized** constructors.
- To practice **method creation** for performing arithmetic operations.
- To understand how to work with **complex numbers** and represent them in an object-oriented manner.

### Example:
For the complex numbers `c1 = 3 + 4i` and `c2 = 1 + 2i`, the output of the operations will be:
- **Addition**: `c1 + c2 = (3 + 1) + (4 + 2)i = 4 + 6i`
- **Subtraction**: `c1 - c2 = (3 - 1) + (4 - 2)i = 2 + 2i`
- **Multiplication**: `c1 * c2 = (3*1 - 4*2) + (4*1 + 3*2)i = -5 + 10i`
- **Division**: `c1 / c2 = ((3*1 + 4*2) / (1^2 + 2^2)) + ((4*1 - 3*2) / (1^2 + 2^2))i = 11/5 + i/5`

This problem helps in learning how to work with classes, objects, and constructors in Java, while also applying them to real-world scenarios like performing arithmetic on complex numbers.
