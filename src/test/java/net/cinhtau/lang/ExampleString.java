package net.cinhtau.lang;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleString {

    private static final Logger logger = LogManager.getLogger(ExampleArrays.class);

    @Test
    public void split() {
        //given
        String session = "endpoint.as[\"SophosAV\"].lastupdate=\"42638\"\n" +
                "endpoint.av[\"SophosAV\"]={}\n" +
                "endpoint.av[\"SophosAV\"].exists=\"true\"";
        String[] expected = {
                "endpoint.as[\"SophosAV\"].lastupdate=\"42638\"",
                "endpoint.av[\"SophosAV\"]={}",
                "endpoint.av[\"SophosAV\"].exists=\"true\"",
        };
        //when
        String[] actual = session.split("\n");

        for (String line : actual) {
            logger.info(line);
        }
        //then
        assertArrayEquals(expected, actual, "String parsed correctly");
    }

    @Test
    public void substring() {
        //given
        String cert = "endpoint.certificate.user[\"10\"].time_valid_from=\"1553673963\"";
        int beginIndex = cert.indexOf("\"");
        int endIndex = cert.indexOf("\"", beginIndex + 1);
        //when
        String actual = cert.substring(beginIndex + 1, endIndex);
        //then
        assertEquals("10", actual, "certificate no 10");
    }

}
