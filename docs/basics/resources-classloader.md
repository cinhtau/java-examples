# Class Loading


## File-Path

Haven resources like properties or images in separate folders from the source doesn't matter. 
Maven copies the resources into the target folder. To access these resources just use Class Loading to determine file path.

```java
URL resource = this.getClass().getClassLoader().getResource("picture.jpg");
File file = new File(resource.toURI());
FileInputStream fis = new FileInputStream(file);
```