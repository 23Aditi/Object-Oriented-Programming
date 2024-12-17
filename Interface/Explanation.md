# 🚗 **Interface in Java: A Vehicle Example**

## 🛠️ **Objective**:
In this project, we will explore **Interfaces** in Java by designing a common functionality blueprint for different types of vehicles like **Bicycle**, **Car**, and **Bike**. These vehicles share common actions like:
- Gear Change
- Speed Up
- Apply Brakes

But each of these vehicles performs these actions in its own specific way. Let’s dive into understanding how to define and implement such an interface!

---

## 🏁 **Concepts Covered**:
### 1. **Interface** 
   - **Definition**: An interface in Java is like a **contract** that defines a set of methods that any class implementing the interface must provide. Interfaces provide a way to specify what functionalities a class should have without dictating how those functionalities should be implemented.
   - **Why use interfaces**?  
     - It helps achieve **polymorphism**.
     - Provides **abstraction** – the class doesn't need to know how the methods are implemented, just that they exist.
     - Promotes **loose coupling** – classes only need to know about the interface, not the actual implementation.

### 2. **Polymorphism** 
   - **Definition**: Polymorphism allows one interface to be used for a general class of actions. The exact action is determined at runtime, meaning that you can call the same method on different objects, and each will act according to its class-specific implementation.
   - In our case, even though all vehicles will have `gearChange()`, `speedUp()`, and `applyBrakes()`, each vehicle will implement these methods in its own way.

### 3. **Abstracting Common Functionality** 
   - By using an interface, we provide a **common blueprint** for all vehicles to follow, even though each vehicle might have its own way of implementing these actions.

---

## ⚙️ **Steps to Implement**:

### Step 1: **Define the Vehicle Interface**

An interface `Vehicle` will contain the method signatures for common functionalities:

```java
// Vehicle Interface
interface Vehicle {
    void gearChange();   // Method to change gears
    void speedUp();      // Method to speed up
    void applyBrakes();  // Method to apply brakes
}
```

- **Why an Interface?** We use an interface because it ensures that all vehicle types will have these basic functionalities, but the details of how they work will be defined by each vehicle class.

---

### Step 2: **Concrete Classes Implement the Interface**

#### **Bicycle Class**:

```java
class Bicycle implements Vehicle {

    @Override
    public void gearChange() {
        System.out.println("Bicycle gear changed by rotating the gear knob.");
    }

    @Override
    public void speedUp() {
        System.out.println("Bicycle speed is increased by pedaling faster.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Bicycle brakes applied by hand levers.");
    }
}
```

- **Why Bicycle?** A **Bicycle** has gears, but it speeds up by pedaling and brakes using hand levers. This is different from a car, which has a throttle.

#### **Bike Class**:

```java
class Bike implements Vehicle {

    @Override
    public void gearChange() {
        System.out.println("Bike gear changed using the gear lever.");
    }

    @Override
    public void speedUp() {
        System.out.println("Bike speed increased by accelerating the throttle.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Bike brakes applied by pressing the brake lever.");
    }
}
```

- **Why Bike?** A **Bike** operates with gears and a throttle, making it different from a Bicycle, and it requires a brake lever to apply brakes.

#### **Car Class**:

```java
class Car implements Vehicle {

    @Override
    public void gearChange() {
        System.out.println("Car gear changed using the gear shift.");
    }

    @Override
    public void speedUp() {
        System.out.println("Car speed increased by pressing the accelerator.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Car brakes applied by pressing the brake pedal.");
    }
}
```

- **Why Car?** A **Car** has automatic or manual gears, an accelerator, and a brake pedal. It’s different from the other two vehicles.

---

### Step 3: **Testing the Interface Implementation**

Finally, in the **Main Class**, we can create objects of each vehicle type and call their respective methods:

```java
public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        System.out.println("Bicycle:");
        bicycle.gearChange();
        bicycle.speedUp();
        bicycle.applyBrakes();

        System.out.println("\nBike:");
        bike.gearChange();
        bike.speedUp();
        bike.applyBrakes();

        System.out.println("\nCar:");
        car.gearChange();
        car.speedUp();
        car.applyBrakes();
    }
}
```

- **What Happens Here?** This demonstrates **polymorphism** because although `bicycle`, `bike`, and `car` are different objects, they all use the same interface but have their own specific implementations of `gearChange()`, `speedUp()`, and `applyBrakes()`.

---

## 🧠 **What Have We Learned?**

1. **Interfaces**: Used to define a common contract for classes, ensuring that they all have certain functionalities, while leaving the implementation up to the class itself.
2. **Polymorphism**: We can treat objects of different classes in a uniform way (using the same method names) but they exhibit behavior unique to their class.
3. **Abstraction**: The details of how the vehicle performs actions like changing gears or applying brakes are hidden, and we only focus on the action itself.

---

## 🎉 **Conclusion:**
Interfaces allow us to design a flexible and reusable structure for different types of vehicles that share common actions. With polymorphism, we can treat different objects (bicycle, bike, car) in the same way while maintaining their specific behaviors. This makes our code scalable, maintainable, and easier to extend for future vehicle types!

---

## ✨ **Next Steps**:

1. Experiment with adding more vehicles, like a **Truck** or **Bus**, and implement the interface methods.
2. Explore more real-world use cases for interfaces in Java!
```

---

