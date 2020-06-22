# Comparing Object Values Using Hash Codes

The hash code of an object is an integer value that's computed using the value of the object. 
For example, for a String object, the characters of the string are used to compute the hash code. 
For an Integer object, the integer value is used to compute the hash code.

Hash codes are typically used as an efficient way of comparing the values of two objects. 
For example, if the hash code of the string "hello" is 33, another String object with the same contents would also 
a hash code of 33.

If the hash codes of two object values are different, the object values are guaranteed to be different. 
However, if the hash codes of two object values are the same, the object values are not guaranteed to be the same. 
An additional call to <code>Object.equals()</code> must be made to confirm that the object values are the same. 
A good hash code algorithm will minimize the chance of two different values having the same hash code.

The <code>'=='</code> operator is the most efficient way to determine if two objects (rather than object values) are 
the same. However, in very limited applications, it may be necessary to get the hash code of an object 
(called the identity hash code) rather than of the object value. 
For example, a hash table of objects requires the use of the identity hash code.

```java
File file1 = new File("a");
File file2 = new File("a");
File file3 = new File("b");

// Get the hash codes
int hc1 = file1.hashCode(); // 1234416
int hc2 = file2.hashCode(); // 1234416
int hc3 = file3.hashCode(); // 1234419

// Check if two object values are the same
if (hc1 == hc2 && file1.equals(file2)) {
    // They are the same
}

// Get the identity hash codes
int ihc1 = System.identityHashCode(file1); // 1027049
int ihc2 = System.identityHashCode(file2); // 14642381
int ihc3 = System.identityHashCode(file3); // 6298545
```

