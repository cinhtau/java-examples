Back to [Data Structures](index.md)

## Associating a Value with an Object

This example demonstrates how to associate a value with an arbitrary object.

The technique involves saving the object and the associated value as a key/value pair in an
`IdentityHashMap`.
A `HashMap` cannot be used for this purpose since if two objects happen to equal via
the `Object.equals()` method, one of the objects will not be stored.

```java
// Create the map
Map objMap = new IdentityHashMap();

// Add the object and value pair to the map
Object o1 = new Integer(123);
Object o2 = new Integer(123);
objMap.put(o1, "first");
objMap.put(o2, "second");

// Retrieve the value associated with the objects
Object v1 = objMap.get(o1); // first
Object v2 = objMap.get(o2); // second

System.out.println(v1.equals(v2)); //false
```
