# Java Spring Boot Boilerplate (Spring Boot 3.1)

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

### spring info

- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.profiles.groups
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.testing.spring-boot-applications.autoconfigured-spring-restdocs
- https://spring.io/projects/spring-restdocs
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.testing.spring-boot-applications.spring-mvc-tests
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#web.servlet.spring-mvc.error-handling
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#web.servlet.spring-mvc.cors
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#messaging
- https://docs.spring.io/spring-framework/reference/integration/email.html
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto.testing.with-spring-security
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto.build.generate-git-info
- https://docs.spring.io/spring-framework/reference/core/aop-api.html
- https://docs.spring.io/spring-framework/reference/integration/cache.html
- https://docs.spring.io/spring-framework/reference/integration/scheduling.html
- https://docs.spring.io/spring-framework/reference/integration/jms.html
- https://docs.spring.io/spring-framework/reference/web/webmvc-cors.html
- https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-ann-rest-exceptions.html
- https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-security.html
- https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-caching.html
- https://docs.spring.io/spring-framework/reference/web/webmvc-test.html
- https://docs.spring.io/spring-framework/reference/testing.html
- https://docs.spring.io/spring-framework/reference/core/validation/format-configuring-formatting-globaldatetimeformat.html
- https://docs.spring.io/spring-framework/reference/core/validation/conversion.html
- https://docs.spring.io/spring-framework/reference/core/validation.html
- https://docs.spring.io/spring-framework/reference/core/expressions.html
- https://docs.spring.io/spring-framework/reference/core/aop.html

### Included technologies
- Spring Boot 3.1
- Spring Security
- Spring Data JPA
- Spring Data Redis
- Hibernate
- JWT Authentication
- PostgreSQL
- Redis
- Liquibase
- Lombok
- Swagger
- JUnit 5
- Mockito

### Requirements
- Java 17
- Maven 3.9.3
- Docker 20.10.8
- Docker Compose 2.19.1
- PostgreSQL 13.11
- Redis 7.0.12

### Run with Docker Compose
```bash
docker-compose up --build -d
```

### Install dependencies
```bash
mvn clean install
```

### Run project
```bash
mvn spring-boot:run 
```

### Build project
```bash
mvn clean package
```

### Skip integration tests
```bash
mvn clean install -DskipITs=true
```
