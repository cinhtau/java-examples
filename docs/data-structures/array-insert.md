## Inserting an Element into a Sorted Array

This example demonstrates how to determine the index at which an element should be inserted into a sorted array. 
Although binarySearch() is used to locate existent elements, it can also be used to determine the insert index for 
non-existent elements. Specifically, the insertion index is computed in the following way: 

```
insert-index = (-return-value)-1
```

```java
// Create anarray with an ordered list of items
String[] sortedArray = new String[]{"ant", "bat", "cat", "dog"};

// Search for a non-existent item and then insert it
int index = Arrays.binarySearch(sortedArray, "cow");
if (index < 0) {
	// Compute the insert index
	int insertIndex = -index-1;

	// Insert the new item into sortedArray. The example here creates
	// a new larger array to hold the new item.
	String[] newSortedArray = new String[sortedArray.length+1];
	System.arraycopy(sortedArray, 0, newSortedArray, 0, insertIndex);
	System.arraycopy(sortedArray, insertIndex,
					 newSortedArray, insertIndex+1,
					 sortedArray.length-insertIndex);
	newSortedArray[insertIndex] = "cow";
	sortedArray = newSortedArray;
}
```

Another example

```java
/**
* en = concats the arrays together
*/
protected Object[] concat(Object[] object, Object[] more, Object[] more2) {
   Object[] both = new Object[object.length + more.length + more2.length];
   
   System.arraycopy(object, 0, both, 0, object.length);
   System.arraycopy(more, 0, both, object.length, more.length);
   System.arraycopy(more2, 0, both, object.length + more.length, more2.length);	
   
   return both;       
}
```
