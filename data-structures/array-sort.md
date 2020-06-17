Back to [Data Structures](index.md) &rArr; [Arrays](arrays.md) 

## Sorting an Array 

Recipe for sorting a List (Collection) or an array.

Use Case: You put your data into a collection in random order or used a Properties object that doesn't preserve the 
order and now you want it sorted. 

- If your data is an array, you can sort it using the static ''sort()'' method. 
- If it is a collection, the Wrapper Class ''Collections'' provide the static ''sort()'' method.

```java
package demo;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		String[] fellowship = { "Gandalf",	"Aragorn",
		"Gimli","Legolas","Boromir","Frodo",
		"Sam","Merry","Pippin"};
		
		Arrays.sort(fellowship);
		
		for(String name: fellowship){
			System.out.println(name);
		}
	}
}
```

Output
```
Aragorn
Boromir
Frodo
Gandalf
Gimli
Legolas
Merry
Pippin
Sam
```
