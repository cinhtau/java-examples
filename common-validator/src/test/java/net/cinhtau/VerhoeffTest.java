package net.cinhtau;

import org.apache.commons.validator.routines.checkdigit.CheckDigitException;
import org.apache.commons.validator.routines.checkdigit.VerhoeffCheckDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Validation of Verhoeff algorithm for comparison with custom implementations
 */
class VerhoeffTest {

    @Test
    public void calculateChecksum() throws CheckDigitException {
        // given
        String companyCode = "90368002";
        String expectedChecksum = "3";

        // when
        String actual = VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.calculate(companyCode);

        //then
        assertEquals(expectedChecksum, actual);
    }

    @Test
    public void validateChecksum() {
        // given
        String code = "903680023";
        String faultyCode = "1256369654";
        // when
        // then
        assertTrue(VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.isValid(code));
        assertFalse(VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.isValid(faultyCode));
    }

}
