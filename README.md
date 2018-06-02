# Template for Spark Standalone App
This repository contains a template for Apache Spark Standalone applications. This project uses **Maven** for dependency
management and build.

## Usage
### Import in IntelliJ IDEA
This project is ready to run. You can open it in IntelliJ IDEA and write your own Spark Standalone Application.
Don't forget to add the Scala SDK 2.11.12 to your project in IntelliJ IDEA
(`File` → `Project Structure` → `Global Libraries` → `Add Scala SDK`).

### Package your application into a JAR file and run it locally
```bash
mvn package
java -cp target/spark-template-1.0-SNAPSHOT-jar-with-dependencies.jar de.bigdata.spark.App
```

### Submit your Spark application to a Spark cluster
Make sure to remove `.master("local")` in `App.scala` before packaging your application, if you want to deploy it to a
cluster. Also, you can mark all Spark dependencies in `pom.xml` as provided (`<scope>provided</scope>`), because
they're provided by the cluster manager at runtime.
```bash
mvn package
./spark-submit --master <MASTER_URL> --class de.bigdata.spark.App target/spark-template-1.0-SNAPSHOT-jar-with-dependencies.jar
```