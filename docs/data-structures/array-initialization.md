Back to [Data Structures](index.md) &rArr; [Arrays](arrays.md) 

## Initialization

Unless you specify otherwise, an array of integers is automatically initialized to 0 when it's created. 
If you create an array of objects, like this:

```java
AutoData[] carArray = new AutoData[4000];
```

then, until they're given explicit values, the array elements contain the special `null` object. 
If you attempt to access an array element that contains null, you'll get the runtime error "Null Pointer Assignment." 
The moral is to make sure you assign something to an element before attempting to access it.

You can initialize an array of a primitive type to something besides 0 using this syntax:

```java
int[] intArray = { 0, 3, 6, 9, 12, 15, 18, 21, 24, 27 };
```

Perhaps surprisingly, this single statement takes the place of both the reference declaration and the use of 
new to create the array. The numbers within the curly braces are called the initialization list. 
The size of the array is determined by the number of values in this list.

String array example 
```java
String[] suchBegriffeBern = { "Bern", "Berne", "Berna", 
  "Bern Bahnhof", "Bern Hauptbahnhof", "Bern HB" };
```

Initialize on the fly
```java
private Long createDefaultTestObject(final Long didok, final String[] suchbegriffe) {
  //..
}

//create on the fly
searchQueue.add(createDefaultTestObject(HALTESTELLE_ZUERICH, new String[] { "Zürich HB",
                "Zürich Mainstation",
                "Bahnhof Zürich", "Bahnhofplatz Zürich HB" }));
```
