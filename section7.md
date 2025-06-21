## Section 7: Working with Inheritance

## 7.1 Describing Inheritance and its benefits
- Inheritance lets one class use the properties (fields) and behaviors (methods) of another class
- The class that inherits is called the subclass (or child class)
- The class being inherited from is the superclass (or parent class)
- Use the extends keyword to implement inheritance in Java
- A subclass can reuse code from the superclass and add its own unique methods or fields
- One superclass can have many subclasses, but a subclass can only inherit from one superclass (Java supports single inheritance)
- *Subclass inherits members of a superclass ONLY if it has access to them*

```java
// supertype declaration
public class SuperClass {
    protected String field = "Whizlabs";

    protected void print() {
        System.out.println(field);
    }
}

// subtype declaration
public class SubClass extends SuperClass { }

// code fragment
public class Main {
    public static void main(String[] args) {
        SubClass object = new SubClass();
        object.print();  // Output: Whizlabs
    }
}
```

## 7.2 Develop Code that makes use of Polymorphism
**Polymorphism**
The ability for a method to behave differently based on the actual objects it's invoked on
```java
// Superclass
public class MyClass {
    protected void print() {
        // empty body
    }
}

// Subclass 1
public class SubClass1 extends MyClass {
    public void print() {
        System.out.println("SubClass1");
    }
}

// Subclass 2
public class SubClass2 extends MyClass {
    public void print() {
        System.out.println("SubClass2");
    }
}

// Code fragment (typically inside a main method)
public class TestPolymorphism {
    public static void main(String[] args) {
        MyClass object1 = new SubClass1();
        MyClass object2 = new SubClass2();

        object1.print();        // Output: SubClass1
        object2.print();        // Output: SubClass2
    }
}
```

**Method Overriding**
- Method overriding lets a subclass replace a method from its superclass with its own version
- The method must have the same name, return type, and parameters
- The overriding method can be more accessible, but not less

```java
// Method Overriding Example

public class SuperClass {
    protected void print() {
        System.out.println("Printed from SuperClass");
    }
}

public class SubClass extends SuperClass {
    public void print() {
        System.out.println("Printed from SubClass");
    }
}

// code fragment
SubClass object = new SubClass();
object.print();

```