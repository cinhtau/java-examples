Back to [Main](../../../README.md) &rArr; [Base](../index.md)

# String

* [Java 11 Doc](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)

## Comparing Strings

```java
String s1 = "a";
String s2 = "A";
String s3 = "B";

// Check if identical
boolean b = s1.equals(s2);           // false

// Check if identical ignoring case
b = s1.equalsIgnoreCase(s2);         // true

// Check order of two strings
int i = s1.compareTo(s2);            // 32; lowercase follows uppercase
if (i < 0) {
    // s1 precedes s2
} else if (i > 0) {
    // s1 follows s2
} else {
    // s1 equals s2
}

// Check order of two strings ignoring case
i = s1.compareToIgnoreCase(s3);      // -1
if (i < 0) {
    // s1 precedes s3
} else if (i > 0) {
    // s1 follows s3
} else {
    // s1 equals s3
}

// A string can also be compared with a StringBuffer;
// see Constructing a String
StringBuffer sbuf = new StringBuffer("a");
b = s1.contentEquals(sbuf);          // true
```

## Constructing a String

If you are constructing a string with several appends, it may be more efficient to construct it using a `StringBuffer` (synchronized), `StringBuilder` (non-synchronized)  and then convert it to an immutable `String` object.

```java
StringBuffer buf = new StringBuffer("Java");

// Append
buf.append(" Almanac v1/");      // Java Almanac v1/
buf.append(3);                   // Java Almanac v1/3

// Set
int index = 15;
buf.setCharAt(index, '.');       // Java Almanac v1.3

// Insert
index = 5;
buf.insert(index, "Developers ");// Java Developers Almanac v1.3

// Replace
int start = 27;
int end = 28;
buf.replace(start, end, "4");    // Java Developers Almanac v1.4

// Delete
start = 24;
end = 25;
buf.delete(start, end);          // Java Developers Almanac 1.4

// Convert to string
String s = buf.toString();
```

## Converting a Primitive Type Value to a String

There are two ways to convert a primitive type value into a string. 
The explicit way is to call `String.valueOf()`. 
The implicit way is to use the string concatenation operator `+`.

```java
// Use String.valueOf()
String s = String.valueOf(true);     // true
s = String.valueOf((byte)0x12);      // 18
s = String.valueOf((byte)0xFF);      // -1
s = String.valueOf('a');             // a
s = String.valueOf((short)123);      // 123
s = String.valueOf(123);             // 123
s = String.valueOf(123L);            // 123
s = String.valueOf(1.23F);           // 1.23
s = String.valueOf(1.23D);           // 1.23

// Use +
s = ""+true;                         // true
s = ""+((byte)0x12);                 // 18
s = ""+((byte)0xFF);                 // -1
s = ""+'a';                          // a
s = ""+((short)123);                 // 123
s = ""+123;                          // 123
s = ""+123L;                         // 123
s = ""+1.23F;                        // 1.23
s = ""+1.23D;                        // 1.23
```

## Converting a String to Upper or Lower Case

```java
// Convert to upper case
String upper = string.toUpperCase();

// Convert to lower case
String lower = string.toLowerCase();
```

## Converting Between Unicode and UTF-8

```java
try {
    // Convert from Unicode to UTF-8
    String string = "abc\u5639\u563b";
    byte[] utf8 = string.getBytes("UTF-8");

    // Convert from UTF-8 to Unicode
    string = new String(utf8, "UTF-8");
} catch (UnsupportedEncodingException e) {
    
}
```

## Converting byte[] array to String

For text or character data, we use new `String(bytes, StandardCharsets.UTF_8)` to convert a `byte[]` to a `String`.

```java
import java.nio.charset.StandardCharsets;

// string to byte[]
byte[] bytes = "hello".getBytes();

// byte[] to string
String s = new String(bytes, StandardCharsets.UTF_8);
// without StandardCharsets
s = new String(bytes, "UTF-8");
```

However, for cases that `byte[]` is holding the binary data like the image or other non-text data, the best practice is 
to convert the `byte[]` into a Base64 encoded String.

```java
// file to byte[]
byte[] bytes = Files.readAllBytes(Paths.get("/path/image.png"));

// Java 8 - Base64 class, finally.
// byte[] to base64 encoded string
String s = Base64.getEncoder().encodeToString(bytes);
System.out.println(s);

// base64 encoded string to byte[]
byte[] decode = Base64.getDecoder().decode(s);
```

## Determining a Character's Unicode Block

## Determining If a String Contains a Substring

## Determining If a String Is a Legal Java Identifier

## Getting a Substring from a String

## Replacing Characters in a String

## Replacing Substrings in a String

## Searching a String for a Character or a Substring

## Split Contents

Two methods are available

```java
public String[] split(String regex, int limit)
public String[] split(String regex)
```

