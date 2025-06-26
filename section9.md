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


## 9.4