Back to [Data Structures](index.md)

##  Converting a Collection to an Array

- contains type casting - yikes
- todo review

```java
// Create an array containing the elements in a list
Object[] objectArray = list.toArray();
MyClass[] array = (MyClass[])list.toArray(new MyClass[list.size()]);

// Create an array containing the elements in a set
objectArray = set.toArray();
array = (MyClass[])set.toArray(new MyClass[set.size()]);

// Create an array containing the keys in a map
objectArray = map.keySet().toArray();
array = (MyClass[])map.keySet().toArray(new MyClass[set.size()]);

// Create an array containing the values in a map
objectArray = map.values().toArray();
array = (MyClass[])map.values().toArray(new MyClass[set.size()]);
```

- If the array is not large enough, the array size is redetermined.

See also
- [Converting Array To Collection](array-to-collection.md)
