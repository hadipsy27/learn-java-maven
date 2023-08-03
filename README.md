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


### Membuat Distribution File
* Salah satu plugin yg bisa di gunakan untuk membuat distribution file berserta dependency yg kita butuhkan adalah Assembly Plugin
* https://maven.apache.org/plugins/maven-assembly-plugin/usage.html
* untuk membuat distribution file bisa menggunakan command : `mvn package assembly:single`
* Lalu untuk menjalankan gunakan perintah : `java -jar .\target\belajar-apache-maven-1.0-SNAPSHOT-jar-with-dependencies.jar`
* setelah itu bisa di upload ke server atau di jadikan docker image juga bisa
  `

