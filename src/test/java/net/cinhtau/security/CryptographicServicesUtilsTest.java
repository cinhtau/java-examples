package net.cinhtau.security;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CryptographicServicesUtilsTest {

    private static final Logger logger = LogManager.getLogger(CryptographicServicesUtilsTest.class);

    @Test
    void getServiceTypes() {
        //given
        logger.info("JDK: {}, Version: {}", System.getProperties().get("java.vm.name"), System.getProperties().get("java.runtime.version"));
        //when
        String[] serviceTypes = CryptographicServicesUtils.getServiceTypes();
        for (String type : serviceTypes) {
            logger.info(type);
        }

        List<String> serviceTypeList = Arrays.asList(serviceTypes);

        //then
        assertNotNull(serviceTypes);
        assertTrue(serviceTypeList.contains("MessageDigest"));
    }

    @Test
    void getCryptoImpls() {


        // arrange
        String[] expecteds = new TestCryptoImpl().getCryptoImpls();
        // act
        String[] actuals = CryptographicServicesUtils
                .getCryptoImpls("MessageDigest");
        List<String> values = Arrays.asList(actuals);
        // assert
        // verify only digest that we know
        for (String name : expecteds) {
            assertTrue(values.contains(name));
        }
        //output actuals
        System.out.println("=============");
        System.out.println("Known digests");
        System.out.println("=============");
        for (String known : actuals) {
            System.out.println(known);
        }
    }

    @Test
    void testGetCryptoImpls() {
        // given
        String[] expecteds = new TestCryptoImpl().getCryptoImpls();
        // when
        String[] actuals = CryptographicServicesUtils
                .getCryptoImpls("MessageDigest");
        List<String> values = Arrays.asList(actuals);
        // then
        for (String name : expecteds) {
            assertTrue(values.contains(name));
        }

        for (String known : actuals) {
            logger.info(known);
        }
    }

    @Test
    void getSha256Sum() {
        //given
        String message = "kal-el";
        String hash = "aad6cc4252d5d9e3b44d184648f233fa99d7855c2cbf7364a505e76108473390";
        //when
        String actual = CryptographicServicesUtils.getSha256Sum(message);
        //then
        assertEquals(hash, actual, "Superman (not) found");
    }

    @Test
    void getSha1Sum() {
        //given
        String message = "kal-el";
        String hash = "7e2cc7118358a5b31f892fb2624faf729d1a282a";
        //when
        String actual = CryptographicServicesUtils.getSha1Sum(message);
        //then
        assertEquals(hash, actual, "Superman (not) found");
    }

    /**
     * fake object to isolate from operating system
     */
    static class TestCryptoImpl {
        String[] getCryptoImpls() {
            String[] values = {"MD5", "SHA", "SHA1", "SHA-1"};
            return values;
        }
    }

}