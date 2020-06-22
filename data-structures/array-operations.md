Back to [Data Structures](index.md) &rArr; [Arrays](arrays.md) 

# Operations on Arrays

Basic principles how to operate on Arrays

## Insertion

Inserting an item into the array is easy; we use the normal array syntax. The content get overwritten.

```java
arr[0] = 77;
```

## Searching 

We use a `searchKey` variable. It holds the value we're looking for. To search for an item, we step through the array, 
comparing `searchKey` with each element. If the array reaches the last occupied cell with no match being found, 
then the value isn't in the array.

## Verify if an element is in an array

Apache Commons and Guava provides utilities for array operations. 
This recipe verifies if an array contains a specific element.

Apache Commons
```java
package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class ArrayUtilsTest {

	/**
	 * test primitive data type in set
	 */
	@Test
	public void testContainsInt() {
		int[] intArray = { 10, 16, 20, 23, 28, 98 };
		// searchKey
		int valueToFind = 23;
		// act
		boolean actual = ArrayUtils.contains(intArray, valueToFind);
		// assert
		assertEquals(true, actual);
	}

	/**
	 * test primitive data type not in set
	 */
	@Test
	public void testNotContainInt() {
		int[] intArray = { 10, 16, 20, 23, 28, 98 };
		// searchKey
		int valueToFind = 22;
		// act
		boolean actual = ArrayUtils.contains(intArray, valueToFind);
		// assert
		assertEquals(false, actual);
	}

	/**
	 * test object in set
	 */
	@Test
	public void testContainsObject() {
		// arrange
		String[] array = { "Claire", "Miria", "Theresa", "Jennifer", "Lea" };
		// act
		boolean actual = ArrayUtils.contains(array, "Lea");
		// assert
		assertEquals(true, actual);
	}
	
	/**
	 * test object not in set
	 */
	@Test
	public void testContainsObjectNull() {
		// arrange
		String[] array = { "Claire", "Miria", "Theresa", "Jennifer", "Lea" };
		// act
		boolean actual = ArrayUtils.contains(array, null);
		// assert
		assertEquals(false, actual);
	}
}
```

Guava
```java
package com.google.common.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.primitives.Ints;

public class PrimitivesTest {
	
	@Test
	public void testIntContains() {		
		int[] intArray = { 10, 16, 20, 23, 28, 98 };
		// searchKey
		int valueToFind = 23;
		
		boolean actual = Ints.contains(intArray, valueToFind);
		
		assertEquals(true, actual);
	}	
}
```

## Deletion

Deletion begins with a search for the specified item. For the simplicity we assume that the item is present. 
When we find it, we move all the items with higher index values down one element to fill in the spot left 
by the deleted element. 
