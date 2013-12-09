TheGamesDBNetLib
================

TheGamesDB.net java library.
Libraries used:
Simple XML Serialization from http://simple.sourceforge.net/
commons-lang3-3.1 from http://commons.apache.org/proper/commons-lang/download_lang.cgi

To use with maven, add this to your project's pom.xml:

```xml
  <repositories>
    <repository>
      <id>TheGamesDBNetLib-mvn-repo</id>
      <url>https://raw.github.com/AridRayne/TheGamesDBNetLib/mvn-repo/</url>
      <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
      </snapshots>
    </repository>
  </repositories>
  <dependencies>
  	<dependency>
  		<groupId>AridRayne</groupId>
  		<artifactId>TheGamesDBNetLib</artifactId>
  		<version>0.0.1</version>
  	</dependency>
  </dependencies>
```
