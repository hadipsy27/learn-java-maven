How to build this project

* In terminal run this command
  <br>
1. `mvn archetype:generate`
2. next you can write : `maven-archetype-quickstart`
3. Choose archetype : from apache maven
4. Choose org.apache.maven.archetypes:maven-archetype-quickstart version: 8 [1.4 (newer version)]
5. groupId : learn-labs
6. artifactId : belajar-apache-maven
7. version : 1.0-Snapshot (choose Default)
8. package : learn.labs.maven


### Maven lifecycle
1. mvn clean -> untuk menghapus folder target
2. mvn compile -> melakukan compilasi source code
3. mvn test-compile -> melakukan kompilasi unit test
4. mvn test -> menjalankan unit test
5. mvn package -> mem package project menjadi pakaging nya (jar/war/dll)

