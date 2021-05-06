## Filling Elements in an Array

The Arrays class has convenient methods for filling arrays of all eight primitive types:

```java
boolean[] booleanArr = new boolean[10];
boolean booleanFillValue = false;
Arrays.fill(booleanArr, booleanFillValue);

byte[] byteArr = new byte[10];
byte byteFillValue = (byte)0xFF;
Arrays.fill(byteArr, byteFillValue);

char[] charArr = new char[10];
char charFillValue = 0xFF;
Arrays.fill(charArr, charFillValue);

short[] shortArr = new short[10];
short shortFillValue = 0xFF;
Arrays.fill(shortArr, shortFillValue);

int[] intArr = new int[10];
int intFillValue = -1;
Arrays.fill(intArr, intFillValue);

long[] longArr = new long[10];
long longFillValue = -1;
Arrays.fill(longArr, longFillValue);

float[] floatArr = new float[10];
float floatFillValue = -1;
Arrays.fill(floatArr, floatFillValue);

double[] doubleArr = new double[10];
double doubleFillValue = -1;
Arrays.fill(doubleArr, doubleFillValue);
```

There is also a method for filling object arrays:

```java
    String[] StringArr = new String[1];
    String StringFillValue = "";
    Arrays.fill(StringArr, StringFillValue);
```

By default, the nine fill methods shown above set all the elements in the array with the fill value. 
Each fill method has an overloaded version that can restrict the fill to a contiguous range of elements:

```java
// Fill elements 0, 1, 2, and 3; the end index is exclusive
int startIndex = 0;
int endIndex = 4;

Arrays.fill(booleanArr, startIndex, endIndex, booleanFillValue);
Arrays.fill(byteArr, startIndex, endIndex, byteFillValue);
Arrays.fill(charArr, startIndex, endIndex, charFillValue);
Arrays.fill(shortArr, startIndex, endIndex, shortFillValue);
Arrays.fill(intArr, startIndex, endIndex, intFillValue);
Arrays.fill(longArr, startIndex, endIndex, longFillValue);
Arrays.fill(floatArr, startIndex, endIndex, floatFillValue);
Arrays.fill(doubleArr, startIndex, endIndex, doubleFillValue);
Arrays.fill(StringArr, startIndex, endIndex, StringFillValue);
```

