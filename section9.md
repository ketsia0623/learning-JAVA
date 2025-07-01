## Section 9 Working with Selected Classes from the Java API

## 9.1 StringBuilder Class
**StringBuffer**
A thread-safe, mutable sequence of characters; like a string but can be modified 

## 9.2 Create and Manipulate String
**Creating a String**
Using a String literal value
```java
String s = "heyyyy";
```
Using a String constructor
```java
String s = new String("hiiii");
```
**Replacement Methods**
- replace
- replaceAll
- replaceFirst
```java
public class Main {
    public static void main(String[] args) {
        String s = "Java Developer";
        String newS = s.replace("Java", "Python");              //replace method
        System.out.println(newS);
        String news = s.replaceAll("\\s", "-");                 //replaceAll method
        System.out.println(news);
        String NewS = s.replaceFirst("a", "e");                //replaceFirst method
        System.out.println(NewS);
        }
}
```

**Split Method**
```java
String s = "hello-hi";
String[] newS = s.split("-");
```

**Concat Method**
```java

```

**Join Method**
```java

```

**Format Method**


## 9.3 Manipulate Calendar Data
**Date-Time Classes**  
These are immutable objects, new objects are created when we try to modify  
- LocalDateTime
- LocalDate
- LocalTime

**Date-Time Methods**
Creating new instance: now, parse, of*, with*  
```java
LocalDateTime.now();
LocalDate.parse(CharSequence text);
LocalTime.of(int hour, int minute, int second);
```
Getting date-time information: get*  
```java
LocalDate.getYear();
```
Computing another instance of the same type: plus*, minus*  
```java
LocalTime.plusMinutes(long minutesToAdd)
LocalTime.minusWeeks(long weeksToSubstract)
```

**The Period Class**
Models an amount of time in terms of years, months, and days
Methods for creating a new instance: parse, of*, with*
```java
Period.parse(CharSequence text);
Period.ofDays(int days);
Period.withMonths(int months);
```
Method for getting Period info: get*
```java
Period.getYears();
```
Methods for computing another period: plus*, minus*
```java
Period.plusDays(long daysToAdd);
Period.minusDays(long daysToSubstract);
```

## 9.4 ArrayList of given type
A resizeable array implementation of the List interface, implementing all optional list operations, and permits all elements(even null)
- provides methods to manipulate the size of the array that is internally used to store the list

**Creating an Instance of ArrayList**
invoke the no-argument constructor
```java
ArrayList newList = new ArrayList();
```
passing a collection in another constructor
```java
ArrayList newList = new ArrayList(collection);
```

**Adding a new element**
the *add method* inserts the specified element at the specified position, or by default appended at the end
```java
ArrayList myList = new ArrayList();
myList.add("uno");
myList.add(0, "dos");
myList.add("cuatro");
```

**Getting an Element**
the *get method*, returns element at specified position
```java
ArrayList myList = new ArrayList();
myList.add("uno");
//add more stuff to list
Object myele = myList.get(0);
```

**Removing an Element**
the *remove method* removes the element at specified position
```java
myList.remove(4);
```
Can also remove first occurence of specified element if present
```java
myList.remove("hello");
```

**Replacing an Element**
the *set method* replaces the element at the specified position with specified replacement
```java
myList.set(3, "trois");
```

## 9.5 Lambda Expression
Allows me to treat functionality as method argument or code as data
- Similar to anonymous classes but can only be declared as implementations of functional interfaces

**Syntax**
- comma-seperated list of formal parameters enclosed in parentheses
- the arrow token (->)
- a body, which consists of a single expression or a statement block
```java
(Integer i, Integer j) -> {return i == j; };

