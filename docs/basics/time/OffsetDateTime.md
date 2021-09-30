Back to [Main](../../../README.md) &rArr; [Base](../index.md)

# OffsetDateTime

## Convert to Millis

Use `Instant` to get epoch milliseconds.

```java
OffsetDateTime hostTimestamp;

hostTimestamp.toInstant().toEpochMilli();
```