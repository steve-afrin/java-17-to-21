# Foreign Function and Foreign Memory (FFM) API
## Third Preview

* Java 21
* [JEP 442](https://openjdk.org/jeps/442)
* [Guide to Java Project Panama (Baeldung)](https://www.baeldung.com/java-project-panama)

This module covers the difference between JNI and the new FFM API

## The Differences Between JNI and the new Foreign Function and Foreign Memory (FFM) API

* JNI was very brittle
* Not much can be done if the foreign code encounters some kind of exception during processing
* The foreign function needs to access memory on the Java heap with JNI
