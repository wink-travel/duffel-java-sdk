[![Duffel logo](https://github.com/wink-travel/duffel-java-sdk/blob/master/brand_logo.svg)](https://duffel.com)

# Duffel Java SDK
Duffel.com Java SDK based on their publicly available [Postman collection](https://app.getpostman.com/run-collection/15595862-cce09558-a1c8-44f9-bde8-8a18715936c1?action=collection%2Ffork&collection-url=entityId%3D15595862-cce09558-a1c8-44f9-bde8-8a18715936c1%26entityType%3Dcollection%26workspaceId%3D03431b8a-0e9e-49c3-afe5-e2ba9ca63fbc)

This supports Duffel's version: beta

## Instructions
This reactive SDK was generated using openapi-generator-maven-plugin and Spring's reactive WebClient. If you wish to use the Spring beans that were created in this library, add "com.duffel.sdk" to your component scan or add an @Import(DuffelSdkConfiguration.class).

Spring expects 1 property:

<pre>
duffel.api.key=YOUR_API_KEY
</pre>

If you are using Spring, you can inject the available Spring-managed Duffel-beans that are in DuffelSdkConfiguration.

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
