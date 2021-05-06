
```java
Path file = Paths.get(System.getProperty("user.home"), "output", outputFileName);

try {
    Files.deleteIfExists(file);
    Files.createFile(file);
} catch (IOException e) {
    LOGGER.error("Could not prepare output file {}", outputFileName, e);
}

try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
    for (Company company : data.getCompanyList()) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        writer.write(gson.toJson(company));
    }
} catch (IOException e) {
    LOGGER.error("Couldn't write {}", outputFileName, e);
}
```

