## Making a Collection Read-Only

Making a collection read-only involves wrapping the collection in another object whose
 mutation methods all throw <code>UnsupportedOperationException</code>.

## The Case for Immutable Collections 

This is useful if you have a requirement case, where the collection like a history can't be modified. 
Further examples: A set of instructions or a processed order list.

```java
List stuff = Arrays.asList(new String[]{"a", "b"});

// Make a list read-only
List list = new ArrayList(stuff);
list = Collections.unmodifiableList(list);

try {
    // Try modifying the list
    list.set(0, "new value");
} catch (UnsupportedOperationException e) {
    // Can't modify
}
```

### Make a Set immutable 

```java
// Make a set read-only
Set set = new HashSet(stuff);
set = Collections.unmodifiableSet(set);
```

### Make a Map immutable 

```java
// Make a map read-only
Map map = new HashMap();
// Add key/value pairs ...
map = Collections.unmodifiableMap(map);
```

