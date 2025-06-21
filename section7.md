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