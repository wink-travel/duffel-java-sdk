[![Duffel logo](https://github.com/wink-travel/duffel-java-sdk/blob/master/brand_logo.svg)](https://duffel.com)

# duffel-java-sdk
Duffel.com Java SDK based on their publicly available Postman collection: https://app.getpostman.com/run-collection/15595862-cce09558-a1c8-44f9-bde8-8a18715936c1?action=collection%2Ffork&collection-url=entityId%3D15595862-cce09558-a1c8-44f9-bde8-8a18715936c1%26entityType%3Dcollection%26workspaceId%3D03431b8a-0e9e-49c3-afe5-e2ba9ca63fbc

## Instructions
This reactive SDK was generated using openapi-generator-maven-plugin and Spring's reactive WebClient. If you wish to use the Spring beans that were created in this library, add "com.duffel.sdk" to your component scan or add an @Import(DuffelSdkConfiguration.class).

Spring expects 2 properties:

<pre>
duffel.url=https://api.sandbox.transferduffel.tech
duffel.api.key=YOUR_API_KEY
</pre>

You can get the duffel.url for free by adding one of our properties files to your property sources and add a Spring active profile to either duffel-sandbox or duffel-production.

If you are using Spring, you can inject the available Spring-managed Wise-beans that are in DuffelSdkConfiguration.

If you are not using Spring, you will have to instantiate the Api classes manually and configure the url and api key manually. See DuffelSdkConfiguration for inspiration on how you can do that.

## Install
Grab library from Maven repo

~~~ xml
<dependency>
    <groupId>travel.wink</groupId>
    <artifactId>duffel-sdk-java</artifactId>
    <version>{{ VERSION }}</version>
</dependency>
~~~

## Development
Generate library
`mvn clean compile`

Test library
`mvn clean test`
