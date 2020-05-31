## Traversing Collections


> There are three ways to traverse collections: 
> (1) using aggregate operations 
> (2) with the for-each construct and 
> (3) by using Iterators

[Java Tutorial Collection](http://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html)

## Using for-each Construct

The for-each loop is used with both `collections` and `arrays`. 
It's intended to simplify the most common form of iteration, 
where the iterator or index is used solely for iteration, 
and not for any other kind of operation, such as removing 
or editing an item in the collection or array. 

When there is a choice, the for-each loop should be preferred over the for loop, 
since it increases legibility.

> The for-each construct allows you to concisely traverse a collection or array using a for loop. 
> The following code uses the for-each construct to print out each element of a collection on a separate line.

```java
for (Object o : collection)
    System.out.println(o);
```

### Using Iterators 

Listing the Elements of a Collection: This example demonstrates how to iterate 
over the elements of various types of collections.

```java
// For a set or list
for (Iterator it=collection.iterator(); it.hasNext(); ) {
    Object element = it.next();
}

// For keys of a map
for (Iterator it=map.keySet().iterator(); it.hasNext(); ) {
    Object key = it.next();
}

// For values of a map
for (Iterator it=map.values().iterator(); it.hasNext(); ) {
    Object value = it.next();
}

// For both the keys and values of a map
for (Iterator it=map.entrySet().iterator(); it.hasNext(); ) {
    Map.Entry entry = (Map.Entry)it.next();
    Object key = entry.getKey();
    Object value = entry.getValue();
}
```
