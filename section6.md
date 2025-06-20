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

**Default Constructor**
Compiler automatically provides a default no-argument constructor if no user-defined constructor is created
