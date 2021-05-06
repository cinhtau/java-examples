Back to [Data Structures](index.md)

# Arrays

Arrays in Java are treated as Objects! Because an array is an object, its name
is a reference to an array, it's not the array itself.

The array is stored at an address elsewhere in memory,
and the name holds only this address.

## Use Case 

You need to keep track of a fixed amount of information and retrieve it sequentially.

Arrays can be used to hold any linear collection of data. 
The items in an array must all be of the **same type**.

You can make an array of any built-in type (like ints, booleans, etc.) or any object type.

If the the array is declared as `Object[]`, then object references of _any type can be stored in it without casting_.

Example of usage
```java
import java.util.Calendar;

public class ArrayDemo {
    public static void main(String[] args) {
	int monthLen1[]; // declare a reference
	monthLen1 = new int[12]; // construct it

	int monthLen2[] = new int[12]; // short form

	// even shorter with initializiation
	int monthLen3[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	final int MAX = 10;
	Calendar days[] = new Calendar[MAX];
	for (int i = 0; i < days.length; i++) {
	    days[i] = Calendar.getInstance();
	}

	// Two-Dimensional Arrays want a 10-by-24 array
	int me[][] = new int[10][];
	for (int i = 0; i < 10; i++) {
	    me[i] = new int[24];
	}

	// Remember that an array has a ".length" attribute
	System.out.println(me.length);
	System.out.println(me[0].length);
    }
}
```

## Pros
- quick insertion
- very fast access if index known

## Cons
- slow search
- slow deletion
- fixed size

## Content

- [Accessing an Array](array-accessing.md)
- [Initialization](array-initialization.md)
- [Operations on Arrays](array-operations.md)
- [Resizing an Array](array-resizing.md)
- [Comparing Arrays](array-comparing.md)
- [Filling Elements in an Array](array-filling-elements.md)
- [Sorting an Array](array-sort.md)
- [Converting a Collection to an Array](array-to-collection.md)
- [Inserting an Element into a Sorted Array](array-insert.md)
- [Copy array content to another array](array-copy.md)
