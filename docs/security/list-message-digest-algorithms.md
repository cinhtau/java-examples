Retrieving the list of available message digest algorithms requires checking the services provided by all registered providers. 
The retrieved list of names can be used in creating a `MessageDigest` object.

See 

- [CryptographicServicesUtils](../../src/main/java/net/cinhtau/security/CryptographicServicesUtils.java)
- [Test](../../src/test/java/net/cinhtau/security/CryptographicServicesUtilsTest.java)

Output

```text
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA-1
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA1
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA-384
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.1.3.14.3.2.26
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.4
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.3
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.2
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.1
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 1.3.14.3.2.26
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA3-384
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA-224
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA-512/224
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.9
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.8
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.7
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.6
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.5
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA3-224
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA3-512
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.9
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.6
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.5
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.8
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.7
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.2
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.1
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.4
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.3
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - 2.16.840.1.101.3.4.2.10
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - OID.2.16.840.1.101.3.4.2.10
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA-512/256
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA-256
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - MD2
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA3-256
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - SHA-512
[main] INFO  net.cinhtau.security.CryptographicServicesUtilsTest - MD5
```