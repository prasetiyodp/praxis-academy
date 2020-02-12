# Dokumentasi hari ke-1

1. Instalasi JDK
$ sudo apt install openjdk-11-jre

**cek versi java**
$ java -version

2. Instal VS Code
$ sudo apt-get install code

- install Java Extension Pack pada extension VS Code
CTR + P "ext install vscjava.vscode-java-pack"

3. 
- compile baris code
$ javac HelloWorld.java 

- jalankan program yang sudah dicompile
$ java HelloWorld 

- buat file Manifest pada folder yang sama
Manifest.txt

Manifest-version: 1.0
Created-By: 1.0 (Macagua Corporation)
Main-Class: HelloWorld

- buat file jar
$ jar cfe HelloWorld.jar HelloWorld HelloWorld.class 

- jalankan file jar
$ java -jar HelloWorld.jar