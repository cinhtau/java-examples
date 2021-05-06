## JDOM

[JDOM](http://www.jdom.org/) is a simple XML parser. 

Their mission: To provide a complete, Java-based solution for accessing, manipulating, and outputting XML data from Java code.

## Development

### Maven

Development with maven use following coordinates

```xml
<dependency>
    <groupId>jdom</groupId>
    <artifactId>jdom</artifactId>
    <version>${jdom.version}</version>
</dependency>
```

## Recipes 

### Create XML Tree

This article covers the creations of [JDOM](http://www.javaworld.com/javaworld/jw-07-2000/jw-0728-jdom2.html).

### Creating a Document 

Construct a JDOM Document from scratch with no existing XML data store

```java
Element root = new Element("myRootElement");
Document doc = new Document(root);
root.setText("This is a root element");
```

Creates output
```xml
<?xml version="1.0"?>
<root>This is a root element</root>
```

### Creating an Element

Every JDOM Document should contain, at a minimum, a root Element. Each Element, in turn, can contain as few or as 
many child elements as needed to represent the data in the XML document.

```java
Element root = new Element("myRootElement");
Document doc = new Document(root);
```

To change a Document's root Element, you call setRootElement(Element element) on the Document:
```java
Element newRoot = new Element("myNewRootElement");
doc.setRootElement(newRoot);
```

### Making kids

Elements often have child elements. To add a child to an element, you can use the addContent(Element element) method:

```java
// Create a parent and two kids
Element parent = new Element("parent");
Element child1 = new Element("firstChild").setText("I'm number one");
Element child2 = new Element("secondChild").setText("I'm number two");
// Add the kids
parent.addContent(child1);
parent.addContent(child2);
```

The resulting XML would look like:

```xml
<parent>
  <firstChild>I'm number one</firstChild>
  <secondChild>I'm number two</secondChild>
</parent>
```

### Process recursively a XML tree

This class ''TreePrinter'' demonstrates how to navigate and process an XML tree recursively.

```java
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

public class TreePrinter {

  // Recursively descend the tree
  public static void process(Element element) {
    
    inspect(element);
    List content = element.getContent();
    Iterator iterator = content.iterator();
    while (iterator.hasNext()) {
      Object o = iterator.next();
      if (o instanceof Element) {
        Element child = (Element) o;
        process(child);
      }
    }
    
  }

  // Print the properties of each element
  public static void inspect(Element element) {
    
    if (!element.isRootElement()) {
      // Print a blank line to separate it from the previous
      // element.
      System.out.println(); 
    }
    
    String qualifiedName = element.getQualifiedName();
    System.out.println(qualifiedName + ":");
    
    Namespace namespace = element.getNamespace();
    if (namespace != Namespace.NO_NAMESPACE) {
      String localName = element.getName();
      String uri = element.getNamespaceURI();
      String prefix = element.getNamespacePrefix();
      System.out.println("  Local name: " + localName);
      System.out.println("  Namespace URI: " + uri);
      if (!"".equals(prefix)) {
        System.out.println("  Namespace prefix: " + prefix);
      }
    }
    List attributes = element.getAttributes();
    if (!attributes.isEmpty()) {
      Iterator iterator = attributes.iterator();
      while (iterator.hasNext()) {
        Attribute attribute = (Attribute) iterator.next();
        String name = attribute.getName();
        String value = attribute.getValue();
        Namespace attributeNamespace = attribute.getNamespace();
        if (attributeNamespace == Namespace.NO_NAMESPACE) {
          System.out.println("  " + name + "=\"" + value + "\""); 
        }
        else {
          String prefix = attributeNamespace.getPrefix();
          System.out.println(
           "  " + prefix + ":" + name + "=\"" + value + "\""); 
        }
      }
    }
    
    List namespaces = element.getAdditionalNamespaces();
    if (!namespaces.isEmpty()) {
      Iterator iterator = namespaces.iterator();
      while (iterator.hasNext()) {
        Namespace additional = (Namespace) iterator.next();
        String uri = additional.getURI();
        String prefix = additional.getPrefix();
          System.out.println(
           "  xmlns:" + prefix + "=\"" + uri + "\""); 
      }
    }
    
  }
  
  public static void main(String[] args) {

    if (args.length <= 0) {
      System.out.println("Usage: java TreePrinter URL");
      return;
    }
    
    String url = args[0];
    
    try {
      SAXBuilder parser = new SAXBuilder();
      
      // Parse the document
      Document document = parser.build(url); 
      
      // Process the root element
      process(document.getRootElement());

    }
    catch (JDOMException e) {
      System.out.println(url + " is not well-formed.");
    }
    catch (IOException e) { 
      System.out.println(
       "Due to an IOException, the parser could not encode " + url
      ); 
    }
     
  } // end main

}
```

Invoke Treeprinter
```bash
java TreePrinter config.xml
```
