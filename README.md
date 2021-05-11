Copy the client keystore from java-ssl-server to src/main/resources


to run with custom truststore: 

`java -Djavax.net.debug=ssl  -Djavax.net.ssl.trustStore=./src/main/resources/client.jks -Djavax.net.ssl.trustStorePassword=changeit -jar target/java-ssl-client-0.0.1-SNAPSHOT.jar `