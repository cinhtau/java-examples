## Accessing an Array

Array elements are accessed using square brackets. This is similar to how other languages work.

```java
temp = intArray[3];          // get contents of fourth element of array
intArray[7] = 66;            // insert 66 into the eighth cell
```

The first element is numbered 0, so that the indices in an array of 10 elements run from 0 to 9. 
If you use an index that's less than 0 or greater than the size of the array less 1, 
you'll get the `Array Index Out of Bounds` runtime error.

Using the for Statement for Iteration. This works since Java 5.0.

The for statement can be used to conveniently iterate over the elements of an array or collection. 
The general syntax of the array-based for statement is:

```java
for (type variable : array) {
    body-code
}
```

The array-based for statement has four parts. The array is an expression that returns an array. 
The type specifies the type of variable which will be used to hold elements from the array. 
In particular, variable always holds the current element of the iteration and can be used by the code in body-code. 
body-code is code that will be executed once for every element in the array. Here is an example of the for statement.

```java
// Returns the smallest integer in the supplied array
public int getMin(int[] ints) {
	int min = Integer.MAX_VALUE;
	for (int num : ints) {
		if (num < min) {
			min = num;
		}
	}
	return min;
}
```
