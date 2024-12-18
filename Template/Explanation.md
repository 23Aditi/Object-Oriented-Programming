# 📚 **Java Generics Explained in Detail** ✨

Welcome to an exciting deep dive into **Java Generics**! 🧐 Whether you're new to generics or looking to brush up on your knowledge, this guide will cover **upper bounds**, **lower bounds**, **wildcards**, and everything you need to know.

---

### **What are Wildcards in Java Generics?**

Wildcards (`?`) in Java allow us to specify **unknown types** in a flexible way, providing powerful functionality with generics. Wildcards are useful when you want to make your code more general and adaptable, without being tied to a specific type. Think of them as a placeholder for any type. 🧩

#### **Types of Wildcards:**

1. **Unbounded Wildcard (`?`)**  
   This is the most general form of wildcard. It means "I don't care what type it is; I just want something."

   **Example**:
   ```java
   public static void printList(List<?> list) {
       for (Object obj : list) {
           System.out.println(obj);
       }
   }
   ```
   In the example above, the method accepts a `List` of any type (e.g., `List<Integer>`, `List<String>`, `List<Double>`).

---

### **Upper Bounded Wildcard (`? extends T`)** 📈

The **upper bounded wildcard** allows you to restrict the types that can be used with generics. Specifically, it restricts the wildcard to a type that is a subtype (or the type itself) of the specified class.

#### **Use Case**: 
When you want to accept objects of type **T** or any subclass of **T**. This is useful when you only want to perform actions that are common to the specified type and all of its subtypes.

**Syntax**:  
`? extends T` means any type that **extends** `T`, including `T` itself.

**Example**:
```java
public static void printNumbers(List<? extends Number> list) {
    for (Number num : list) {
        System.out.println(num);
    }
}
```
Here, the method accepts a `List` of any type that extends `Number` (such as `Integer`, `Double`, `Float`, etc.).

**Limitations**:
- You can **read** from a `List<? extends T>` but cannot **write** into it (except for `null`), because the exact type of the elements is unknown.

---

### **Lower Bounded Wildcard (`? super T`)** 📉

The **lower bounded wildcard** is used to accept a **supertype** of the specified class. This means that you can work with **T** or any type that is a **superclass** of **T**.

#### **Use Case**: 
When you want to write into a collection of objects, and the objects could be of type **T** or any of its supertypes.

**Syntax**:  
`? super T` means any type that is a **superclass** of `T`, including `T` itself.

**Example**:
```java
public static void addNumbers(List<? super Integer> list) {
    list.add(10);  // You can add Integer and its superclasses
}
```
Here, the method accepts a `List` of any type that is a superclass of `Integer` (such as `Number` or `Object`).

**Why use `? super T`?**
- When you want to add items of a particular type (and its subtypes) to a collection.

---

### **Using Wildcards in Bounded Type Parameters**

Wildcards can also be applied to **bounded type parameters**. When you use a wildcard with bounds, it specifies the range of types that are valid for the wildcard.

#### **Upper Bounded Wildcard with `extends`**:
```java
public static <T extends Number> void printNumbers(List<? extends T> list) {
    for (T num : list) {
        System.out.println(num);
    }
}
```
In this case, we restrict the type of `T` to be `Number` or its subclasses.

#### **Lower Bounded Wildcard with `super`**:
```java
public static <T> void addToList(List<? super T> list, T element) {
    list.add(element);  // Allows adding the element
}
```
Here, `T` is a parameter, and we accept any type that is a supertype of `T`.

---

### **Why Use Generics and Wildcards?** 🛠️

- **Flexibility and Reusability**: Generics allow you to write **generalized code** that can be used for multiple data types. You can implement **type safety** while still being flexible.
- **Type Safety**: Generics help avoid runtime errors caused by incorrect type casting. With wildcards and bounds, you ensure that the correct type is being used.
- **Cleaner Code**: Generics eliminate the need for explicit casting, making your code cleaner and easier to maintain.

---

### **Key Concepts in Generics** 🎯

1. **Generic Classes**:  
   A class that uses a type parameter.  
   Example:  
   ```java
   public class Box<T> {
       private T value;
       
       public void setValue(T value) {
           this.value = value;
       }
       
       public T getValue() {
           return value;
       }
   }
   ```

2. **Generic Methods**:  
   Methods that can operate on different types, specified by type parameters.  
   Example:  
   ```java
   public static <T> void printList(List<T> list) {
       for (T item : list) {
           System.out.println(item);
       }
   }
   ```

3. **Bounded Type Parameters**:  
   Restrict the types that can be passed to a generic class or method.  
   Example:
   ```java
   public <T extends Number> void printNumber(T number) {
       System.out.println(number);
   }
   ```

4. **Wildcards (`?`)**:  
   Used to specify unknown types.  
   Examples:  
   - Unbounded: `?`  
   - Upper bounded: `? extends T`  
   - Lower bounded: `? super T`

---

### **Real-World Use Case: A Generic Box**

Let’s imagine you want a generic container (like a box) that can hold **anything**:

```java
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello!");
        System.out.println(stringBox.getItem());  // Output: Hello!

        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println(intBox.getItem());  // Output: 42
    }
}
```

This allows the `Box` to hold **any type** of object and is type-safe, meaning no type mismatches will occur!

---

### **Possible Viva Questions** 🤔

Here are some possible questions that could come up during a viva or exam on **Generics** in Java:

1. **What is the purpose of generics in Java? Why do we need them?**
2. **Explain the difference between `? extends T` and `? super T` with examples.**
3. **How does the use of wildcards enhance flexibility in Java generics?**
4. **Can you give an example where you would use an upper bounded wildcard (`? extends T`)?**
5. **What are the limitations of using wildcards in Java?**
6. **What is the difference between `T` and `?` in generics?**
7. **Can you create a generic method that prints an array of any type?**
8. **What happens if you try to add an element to a collection with `? extends T`?**
9. **What is the difference between a generic class and a generic method?**
10. **Why can't you add elements to a list with `List<? extends Number>`?**
11. **Explain the concept of bounded type parameters with an example.**
12. **What would happen if you used `? super T` when retrieving data from a list?**

---

### **Wrap-Up**

By now, you should have a good grasp of **Generics**, **Wildcards**, **Upper Bound**, and **Lower Bound** in Java. Generics are a powerful tool that allows you to write **flexible**, **type-safe**, and **reusable** code. As you practice, you’ll find they become a core part of your Java programming toolkit! 💪

Now, go ahead and experiment with these concepts in your own projects. ✨ Happy coding! 🚀
```

---

It provides a thorough explanation of the **Upper Bound**, **Lower Bound**, and **Wildcards** in generics with practical examples, as well as a list of **Viva Questions** to test your knowledge.

