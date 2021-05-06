# Sets

* A set is a collection that _cannot contain duplicate elements_.
* This interface models the mathematical set abstraction and is used to represent sets.

The Java platform contains three general-purpose `Set` implementations.
* `HashSet`
* `TreeSet`
* `LinkedHashSet`

## HashSet 

* HashSet stores its elements in a hash table
* is the best performing implementation
* however makes no guarantees concerning the order of iteration

## TreeSet

* TreeSet stores its elements in a red-black tree
* orders its elements based on their values
* it is substantially slower than HashSet

## LinkedHashSet 
* This type is implemented as a hash table with a linked list running through it
* orders its elements based on the order it is inserted &rArr; insertion order

## Operations 

### Sort 

A set isn't an ordered collection, so sorting is not available.

Manual sorting of a set

```java
//key is id of employee
Map<Integer, Employee> map = new HashMap<Integer, Employee>();
Set<Integer> set = map.keySet();
Integer[] ids  =  set.toArray(new Integer[set.size()]);
Arrays.sort(ids);

for (Integer key : ids) {
  //do sth
}
```

