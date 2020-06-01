Back to [Basics](index.md)

## Standard

```java
if(foo == null){
  //do sth
}
```

Using null check in a AND condition, the null check should be done first! Otherwise a `NullPointerException` may occur.
```java
String foo = null;
//..
if(foo == null && foo.isEmpty()){
  //do sth
}
```

## java.util

```java
Objects.requireNonNull(foo);
```

## Guava

Use `Preconditions.checkNotNull` checks that the value is not null. Returns the value directly, so you can use `checkNotNull(value)` inline.
```java
/**
 * Ensures that an object reference passed as a parameter to the calling
 * method is not null.
 *
 * @param reference an object reference
 * @return the non-null reference that was validated
 * @throws NullPointerException if {@code reference} is null
 */
public static <T> T checkNotNull(T reference) {
  if (reference == null) {
    throw new NullPointerException();
  }
  return reference;
}
```

Example
```java
package com.google.common.base;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PreconditionsTest {

	@Test(expected = NullPointerException.class)
	public void testCheckIsNull(){
		String surname = null;

		checkNotNull(surname);		
	}

	@Test
	public void testCheckNotNull() {
		String surname = "Nguyen"; //$NON-NLS-1$

		String customerName = checkNotNull(surname, "Customer name is needed."); //$NON-NLS-1$
		assertNotNull(customerName);
	}
}
```

## Apache Commons Lang

<pre class="brush: java; toolbar: false; highlight:[21]">
package org.apache.commons.lang;

import org.apache.commons.lang3.Validate;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValidateTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testNotNull() {
		String message = "The surname must not be null";

		this.thrown.expect(NullPointerException.class);
		this.thrown.expectMessage(message);

		String surname = null;
		Validate.notNull(surname, message);
	}
}
```

Throws a NPE with specific message. Apache Commons Lang implementation:
```java
    public static <T> T notNull(T object, String message, Object... values) {
        if (object == null) {
            throw new NullPointerException(String.format(message, values));
        }
        return object;
    }
```
