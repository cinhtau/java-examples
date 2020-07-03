# Generate SHA Digest

Generate a SHA-1 and SHA-256 hash with Java

## SHA-1

Create a hash with Linux `sha1sum`. Pay attention that linefeed will alter the message.

Without linefeed

```bash
echo -n "kal-el" | sha1sum -
7e2cc7118358a5b31f892fb2624faf729d1a282a  -
```

With linefeed

```bash
echo "kal-el" | sha1sum  
7345daf89166949042d30fdcd64c1381653a0508  -
```

See [CryptographicServicesUtils](../src/main/java/net/cinhtau/security/CryptographicServicesUtils.java)

```java
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
```

## SHA-256

Create hash for SHA-256

```bash
echo -n kal-el | sha256sum      
aad6cc4252d5d9e3b44d184648f233fa99d7855c2cbf7364a505e76108473390  -
```





