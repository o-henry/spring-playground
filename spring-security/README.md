```java
# common oauth2 provider(production ❌)

    *Google
    *Github
    *Facebook
    *Okta

    application.properties
    spring.security.oauth2.client.registration.google.client-id=<client-id>
    spring.security.oauth2.client.registration.google.client-secret=<client-secret>


    # 세션탈취
    동시 로그인 방지
```