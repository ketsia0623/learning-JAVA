## Section 4: Creating and Using Arrays
## 4.1 One-dimensional arrays
**Declaration**
- Array Type
    - `int[]   String[]   MyObject[] ` 
- Array Name
    - `intArray  stringArray  objectArray`
```java
int[] intArray;
```

**Instantiation**
- can be instantiated with the new operator
- followed by the type of elements
- and array length enclosed in square brackets
- `intArray = new int[5]; `

**Initialization**
- initialized with default values when the array is created
- *index starts at 0*  default is null, 0s, and false...

Arrays can also be instantiatied and initialized using an array initializer
- `intArray = {1, 2, 3, 4, 5}; `
- `intArray = new int[] {1, 2, 3, 4, 5}; `  

## 4.2 Multi-dimensional arrays
**Declaration**
- Array Type, with multiple pairs of brackets
    - `int[][](2dimensional)   String[][][](3dimensional)    MyObject[][][](4dimensional) ` 
- Array Name
    - `intArray  stringArray  objectArray`
- `String[][][] stringArray;`

**Instantiation**
- can be instantiated with the new operator
- followed by the type of elements
- and 2 or more pairs of square brackets, each representing a dimention
- `intArray = new int[4][6]; `     *first bracket must contain a length

**Initialization**
- can be initialized by assigning values to its elements at all levels(nested for loops)

Multi-dimensional Arrays can also be instantiatied and initialized using an array initializer
- `int[][] intArray = {{1, 2}, {3, 4, 5}}; `
- `int[][] intArray = new int[][] {{1, 2}, {3, 4, 5}}; `