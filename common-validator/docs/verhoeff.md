# General

The Verhoeff algorithm is a checksum formula for error detection developed by the Dutch mathematician Jacobus Verhoeff
and was first published in 1969.

- [Wikipedia Source](https://en.wikipedia.org/wiki/Verhoeff_algorithm)
- [Algorithm Implementations](https://en.wikibooks.org/wiki/Algorithm_Implementation/Checksums/Verhoeff_Algorithm)

## Validator

Apache Commons provides the class `VerhoeffCheckDigit`.

## Calculate a checksum

```java
@Test
public void calculateChecksum()throws CheckDigitException{
        // given
        String companyCode="90368002";
        String expectedChecksum="3";

        // when
        String actual=VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.calculate(companyCode);
        logger.info("Checksum for {} is {}",companyCode,actual);
        //then
        assertEquals(expectedChecksum,actual);
        }
```

## Validate a code

```java
@Test
public void validateChecksum(){
        // given
        String code="903680023";
        String faultyCode="1256369654";
        // when && then
        assertTrue(VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.isValid(code));
        assertFalse(VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.isValid(faultyCode));
        }
```