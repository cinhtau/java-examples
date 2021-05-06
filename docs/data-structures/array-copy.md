## Copy array content to another array

&laquo;Copies an array from the specified source array, beginning at the specified position, 
to the specified position of the destination array.&raquo;[ref](http://docs.oracle.com/javase/6/docs/api/java/lang/System.html)

```java
@Test
public void testArrayCopy(){
    String[] src = {"20", "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};        
    String[] dest = new String[src.length-1];
    System.arraycopy(src, 1, dest, 0, dest.length);
    
    String[] expecteds = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
    assertArrayEquals(expecteds, dest);
}
```
