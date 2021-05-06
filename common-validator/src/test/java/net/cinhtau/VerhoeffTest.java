package net.cinhtau;

import org.apache.commons.validator.routines.checkdigit.CheckDigitException;
import org.apache.commons.validator.routines.checkdigit.VerhoeffCheckDigit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Validation of Verhoeff algorithm for comparison with custom implementations
 */
class VerhoeffTest {

    private static final Logger logger = LogManager.getLogger(VerhoeffTest.class);

    @Test
    public void calculateChecksum() throws CheckDigitException {
        // given
        String companyCode = "90368002";
        String expectedChecksum = "3";

        // when
        String actual = VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.calculate(companyCode);
        logger.info("Checksum for {} is {}", companyCode, actual);
        //then
        assertEquals(expectedChecksum, actual);
    }

    @Test
    public void validateChecksum() {
        // given
        String code = "903680023";
        String faultyCode = "1256369654";
        // when && then
        assertTrue(VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.isValid(code));
        assertFalse(VerhoeffCheckDigit.VERHOEFF_CHECK_DIGIT.isValid(faultyCode));
    }

}
