Back to [Main](../../../README.md) &rArr; [Base](../index.md)

# Sorted Collections

## Creating a Sorted Set

## Finding an Element in a Sorted Array

## Finding an Element in a Sorted Array

## Finding an Element in a Sorted List

## Inserting an Element into a Sorted Array

##  Inserting an Element into a Sorted List

##  Sorting an Array

```java
int[] intArray = new int[] {4, 1, 3, -23};
Arrays.sort(intArray);
// [-23, 1, 3, 4]

String[] strArray = new String[] {"z", "a", "C"};
Arrays.sort(strArray);
// [C, a, z]

// Case-insensitive sort
Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
// [a, C, z]

// Reverse-order sort
Arrays.sort(strArray, Collections.reverseOrder());
// [z, a, C]

// Case-insensitive reverse-order sort
Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
Collections.reverse(Arrays.asList(strArray));
// [z, C, a]
```

