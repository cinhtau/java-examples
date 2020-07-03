package net.cinhtau.security;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.HashSet;
import java.util.Set;

import static java.nio.charset.StandardCharsets.UTF_8;

public class CryptographicServicesUtils {

    private static final Logger logger = LogManager.getLogger(CryptographicServicesUtils.class);

    private CryptographicServicesUtils() {
    }

    // This method returns all available services types
    public static String[] getServiceTypes() {
        Set<String> result = new HashSet<>();

        // All all providers
        Provider[] providers = Security.getProviders();
        for (Provider provider : providers) {
            // Get services provided by each provider
            Set<?> keys = provider.keySet();
            for (Object o : keys) {
                String key = (String) o;
                key = key.split(" ")[0];

                if (key.startsWith("Alg.Alias.")) {
                    // Strip the alias
                    key = key.substring(10);
                }
                int ix = key.indexOf('.');
                result.add(key.substring(0, ix));
            }
        }
        return result.toArray(new String[result.size()]);
    }


    // This method returns the available implementations for a service type
    public static String[] getCryptoImpls(String serviceType) {
        Set<String> result = new HashSet<>();

        // All all providers
        Provider[] providers = Security.getProviders();
        for (Provider provider : providers) {
            // Get services provided by each provider
            Set<?> keys = provider.keySet();
            for (Object o : keys) {
                String key = (String) o;
                key = key.split(" ")[0];

                if (key.startsWith(serviceType + ".")) {
                    result.add(key.substring(serviceType.length() + 1));
                } else if (key.startsWith("Alg.Alias." + serviceType + ".")) {
                    // This is an alias
                    result.add(key.substring(serviceType.length() + 11));
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

    private static String getMessageDigestSum(final String algorithm, final String text) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance(algorithm);
            final byte[] hashbytes = digest.digest(
                    text.getBytes(UTF_8));

            return bytesToHex(hashbytes);
        } catch (NoSuchAlgorithmException e) {
            logger.warn(e);
        }

        return "";
    }

    public static String getSha1Sum(final String text) {
        return getMessageDigestSum("SHA1", text);
    }

    public static String getSha256Sum(final String text) {
        return getMessageDigestSum("SHA-256", text);
    }

    private static String bytesToHex(byte[] hashbytes) {
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hashbytes.length; i++) {
            String hex = Integer.toHexString(0xff & hashbytes[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}