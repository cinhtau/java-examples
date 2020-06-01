Back to [Data Structures](index.md)

## Converting an Array to a Collection

```java
// Fixed-size list
List list = Arrays.asList(array);

// Growable list
list = new LinkedList(Arrays.asList(array));

// Duplicate elements are discarded
Set set = new HashSet(Arrays.asList(array));
```

See also
- [Converting Collection To Array](collection-to-array.md)
