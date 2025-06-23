## Section 8 Handling Exceptions

## 8.1 Checked n Unchecked Exceptions and Errors
**Checked Exceptions**  
Conditions that a well-written application should anticipate and recover from
- Must be enclosed by either: 
    - a *try* block that catches the exception, followed by a catch and/or a finally block that handles that exception
    - A method that specifies that it can throw the exception
- All exceptions are checked exceptions, except those indicated by Error, RuntimeException and their subclasses

**Unchecked Exceptions**  
Internal to the application, and usually not anticipated to be recovered from   
- Indicate programming bugs, like logic errors or improper use of APIs
- Indicated by RuntimeException and its subclasses

**Errors**   
Internal to the application, and usually not anticipated to be recovered from     
- represented by Error and its subclasses


## 8.2 Try-Catch Block
```java
try {
    System.out.println("All gooD!!")
} catch (Exception e){
    System.out.println("if error<")
}
```

## 8.3 Advantages of Exception Handling
- Seperate error-handling from regular code
- Grouping and differentiating error types