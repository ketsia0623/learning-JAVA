## Section 6: Working with Methods and Encapsulation
## 6.1 Create methods with Arguments and return values
A method takes zero, one or more arguments, does something, then returns zero or one value
```java
int sum (int arg1, int arg2) { 
    System.out.println("Adding up 2 integers");
    return arg1 + arg2;
} 
```
- Java supports method overloading
- These methods are differentiated by the number and the types of arguments

**Overloading Resolution**
- When multiple overloaded methods match a call, Java chooses the most specific one based on parameter types.
- Java goes through three phases to resolve the best match
    - *1st Phase*: Exact Match Only (Most Strict)
        - Only exact type matches are allowed
        - No autoboxing, unboxing, or varargs
            - Autoboxing is when Java automatically converts a primitive (like int) into its wrapper class (Integer)
            - Unboxing is the reverse: converting a wrapper class into a primitive
            - Varargs (variable-length arguments) let a method accept zero or more arguments *(...)* 
    - *2nd Phase*: Allow Boxing/Unboxing (Still No Varargs)
        - If no match in phase 1, Java tries to match with boxing/unboxing
        - Still does not use varargs
    - *3rd Phase*: Allow Boxing + Varargs (Least Strict)
        - If no match yet, Java considers methods with varargs too
        - Combines boxing, unboxing, and varargs

## 6.2 Static Keyword
**Static Variables**  
- Fields with the *static* modifier are static fields, a.k.a. class variables
- shared between all objects of the class

**Static Methods**  
Methods that have the static modifier are static methods, a.k.a. class methods
- Invoked with class name
- Static methods can't access instance variables or methods directly, they must use object references 
- shared between the class


## 6.3 Constructors
Constructors are created using the name of the class and have no return type
```java
class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
```

**Overloading Constructors**  
Multiple constructors may be declared for the same class, given that their parameters are different

```java
public class Person {
    String firstName;
    String lastName;

    // First constructor: only lastName provided
    Person(String lastName) {
        this.firstName = "NoFirstName";
        this.lastName = lastName;
    }

    // Second constructor: both names provided
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
```

**Default Constructor:**
Compiler automatically provides a default no-argument constructor if no user-defined constructor is created


## 6.4 Apply Access Modifiers
**Access control levels**
- Top level: public, or package-private
- Member level: public, protected, package-private, or private

**Modifier permission**
- private: can only be accessed in its own type
- default – package-private: visible only within its own package
- protected: can only be accessed within its own package, and in subtypes of its type in other packages
- public: visible to all types in the application


## 6.5 Applying Encapsulation Principles to a Class
Encapsulation is a mechanism of wrapping data n variables n code acting on the data(methods) together as a single unit  
- Variables of a class are hidden from other classes; and can only be access through methods of their enclosing class
- To achieve encapsulation, we declare variables of a class with the private access modifier, and provide public methods to access these variables

## 6.6 Effect Upon Object References and Primitive Values
**Primitives**
- Store actual values
- When passed to a method, Java makes a copy of the value
- So: changing the parameter does NOT affect the original
```java
void change(int x) {
    x = 10;
}
int num = 5;
change(num);    // num is still 5!
```

**Object References**
- Store the address (reference) of an object in memory
- When passed to a method, the reference (address) is copied
- Both the argument and parameter point to the same object, so changes to the object are visible outside the method
```java
void modify(StringBuilder sb) {
    sb.append(" World");
}
StringBuilder text = new StringBuilder("Hello");
modify(text);  // text is now "Hello World"
```