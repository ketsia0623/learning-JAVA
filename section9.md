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



**Removing an Element**
removesthe element at specified position

**Replacing an Element**