Back to [Data Structures](index.md) &rArr; [Arrays](arrays.md) 

# Resizing an Array 

The array filled up, and you got an `ArrayIndexOutOfBoundsException`. One approach is to allocate the array at a 
reasonable size to begin with, but if you find yourself with more data than will fit, reallocate a new, bigger array 
and copy the elements into it. Therefore you use the `System.arraycopy` method.

```java
import java.util.Calendar;

public class ArrayResize {
    static int n;
    
    public static void main(String[] args) {
	int nDates = 0;
	final int MAX = 10;
	Calendar dates[] = new Calendar[MAX];
	
	Calendar c;
	
	while ((c=getDate()) != null ) {
	    if (nDates >= dates.length) {
		Calendar tmp[] = new Calendar[dates.length + 10];
		System.arraycopy(dates, 0, tmp, 0, dates.length);
		dates = tmp;
	    }
	    dates[nDates++] = c;
	}
	System.out.println("Array size = " + dates.length);
    }

    private static Calendar getDate() {
	if (n++ > 21) {
	    return null;
	}
	return Calendar.getInstance();
    }
}
```

