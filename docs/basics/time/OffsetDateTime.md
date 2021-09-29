# OffsetDateTime

## Convert to Millis

Use `Instant` to get epoch milliseconds.

```java
OffsetDateTime hostTimestamp;

hostTimestamp.toInstant().toEpochMilli();
```