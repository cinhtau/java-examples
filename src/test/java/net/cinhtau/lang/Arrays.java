package net.cinhtau.lang;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Arrays {

    private static final Logger logger = LogManager.getLogger(Arrays.class);

    @Test
    public void sortStrings() {
        // given
        String[] session = new String[]{
                "endpoint.certificate.user[\"3\"].subject_o=\"LANDesk Software, Inc.\"",
                "endpoint.certificate.user[\"2\"].subject_store=\"capi\"",
                "endpoint.certificate.user[\"3\"].issuer_cn=\"VeriSign Class 3 Code Signing 2010 CA\"",
                "endpoint.certificate.user[\"2\"].subject_c=\"CH\"",
                "endpoint.certificate.user[\"2\"]={}"
        };
        String[] expected = new String[]{
                "endpoint.certificate.user[\"2\"].subject_c=\"CH\"",
                "endpoint.certificate.user[\"2\"].subject_store=\"capi\"",
                "endpoint.certificate.user[\"2\"]={}",
                "endpoint.certificate.user[\"3\"].issuer_cn=\"VeriSign Class 3 Code Signing 2010 CA\"",
                "endpoint.certificate.user[\"3\"].subject_o=\"LANDesk Software, Inc.\""
        };
        // when
        java.util.Arrays.sort(session);
        for (String detail : session) {
            logger.info(detail);
        }
        // then
        assertArrayEquals(expected, session, "String array is sorted");
    }

}
