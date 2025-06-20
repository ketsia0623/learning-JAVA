## Section 2: Working with Java DataTypes
## 2.1 Declaring and Initializing Variables
Initializing:
- Class-level variables: declared and initialized at the same time. If we declare without initializing, compiler will set the variable to a default value, depending on its datatype.
- Local variables: Must be explicitly initialized before being used, compiler will not do so.

**Primitive Data Type Casting**
- Widening casting: implicitly implemented, doesn't require cast operator
        - `byte -> short -> int -> long -> float -> double`
- Narrowing casting: explicitly implemented, requires cast operator
        - `double -> float -> long -> int -> short -> byte`
- Casting to and from *char*:
    - Widening casting: `char -> int | long | float | double`
    - Narrowing casting: `char -> byte | short`   
        `short | int | long | float | double -> char`
    - Widening and narrowing casting: `byte <-> char`
- *Primitive type casting never results in a runtime exception*

## 2.2 Object Reference vs Primitive Variables
**Object reference variables**
- Stores the memory addresses(reference) of objects that they refer to
- *always uses new(remember c++)

- Comparison:
    - Compared based on the address of their associated objects in memory(think pointers in c++)
    - `System.out.println(a == b)`;         // false → compares memory addresses
    - `System.out.println(a.equals(b))`;    // true  → compares actual content
- Assignment:
    - Adress is copied when assigning, LHS variable points to same object returned by expression on RHS
- Parameter Passing:
    - passed by the address of referenced object in memory
    - changes made are reflected in the argument
-Value Returning:
    - returned by address of referenced object in memory

**Primitive variables**
- Store actual values

- Comparison:
    - Compared based on literal values
- Assignment:
    - Value of RHS is copied to the LHS, with LHS variable holding its own value
- Parameter Passing
    - Passed in method by actual value
    - changes made to parameter are independent of passed-in argument
- Value Returning
    - returned from method by actual value
    - dies after execution

## 2.3 Read and Write Object Fields
- Statements within an object can access achd change a field of the object using the *this* keyword
- If field isn't shadowed by a local var, the *this* can be left out
- *this* ONLY refers to class variables(therefore overiding the local one)


## 2.4 Object's Lifecycle
**Object Creation**
- Instantiation
    - done with the *new* operator
    - new object is created ONLY when *new* operator is used
-  Initialization
    - implemented by constructors

**Object Destruction**
- Can be destroyed using dereference by reassignment, therefore elligible for garbage collection
- Object has to not have been reference
- Objectis created when new Myclass() is called
        
## 2.5 Code that Uses Wrapper Classes
8 Wrapper Classes are provided for primitive data types
- boolean
- Byte 
- Short
- Integer
- Long
- Float
- Double
- Character
