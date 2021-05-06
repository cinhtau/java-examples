Back to [Data Structures](index.md) &rArr; [Arrays](arrays.md) 

# Comparing Arrays

```java
// null arrays are equal
boolean[] bArr1 = null;
boolean[] bArr2 = null;
boolean b = Arrays.equals(bArr1, bArr2);                   // true

// Compare two boolean arrays
bArr1 = new boolean[]{true, false};
bArr2 = new boolean[]{true, false};
b = Arrays.equals(bArr1, null);                            // false
b = Arrays.equals(bArr1, bArr2);                           // true

// There are equals() methods for all eight primitive types
b = Arrays.equals(new byte[]{0}, new byte[]{0});           // true
b = Arrays.equals(new char[]{'a'}, new char[]{'a'});       // true
b = Arrays.equals(new short[]{0}, new short[]{0});         // true
b = Arrays.equals(new int[]{0}, new int[]{0});             // true
b = Arrays.equals(new long[]{0L}, new long[]{0L});         // true
b = Arrays.equals(new float[]{0F}, new float[]{0F});       // true
b = Arrays.equals(new double[]{0D}, new double[]{0D});     // true

// When comparing Object arrays, null elements are equal.
// If the elements are not null, Object.equals() is used.
b = Arrays.equals(new String[]{"a"}, new String[]{"a"});   // true
b = Arrays.equals(new String[]{null}, new String[]{null}); // true
b = Arrays.equals(new String[]{"a"}, new String[]{null});  // false
```

