# Wrapping a Primitive Type in a Wrapper Object

In the Java language, the eight primitive types --- boolean, byte, char, short, int, long, float, double --- 
are not objects. However, in certain situations, objects are required. For example, collection classes such as Map and 
Set only work with objects. This issue is addressed by wrapping a primitive type in a wrapper object. 
There is a wrapper object for each primitive type.

This example demonstrates how to wrap the value of a primitive type in a wrapper object and then subsequently 
retrieve the value of the primitive type. 

```java
// Create wrapper object for each primitive type
Boolean refBoolean = new Boolean(true);
Byte refByte = new Byte((byte)123);
Character refChar = new Character('x');
Short refShort = new Short((short)123);
Integer refInt = new Integer(123);
Long refLong = new Long(123L);
Float refFloat = new Float(12.3F);
Double refDouble = new Double(12.3D);

// Retrieving the value in a wrapper object
boolean bool = refBoolean.booleanValue();
byte b = refByte.byteValue();
char c = refChar.charValue();
short s = refShort.shortValue();
int i = refInt.intValue();
long l = refLong.longValue();
float f = refFloat.floatValue();
double d = refDouble.doubleValue();
```

