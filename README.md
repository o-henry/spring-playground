<p align="center">
    <samp>
     SPRING PLAYGROUND
    </samp>
</p>

```
# maven
./mvnw spring-boot:run

# gradle
cmd + shift + p → Create a Maven OR Gradle Project
./gradlew
./gradlew jar
./gradlew bootRun

# import
cmd + .

# reload vscode
cmd + shift + p

# setting vscode
cmd + ,

# port
sudo lsof -i :8080
sudo kill -9 <pid>

or

resuorces/application.properties server.port=xxxx

# git
git commit --amend -no-edit


# learning
a. Understand Dependency Injection and it's workings. Do some code examples.
b. Go through official spring documentation (and spring boot).
c. Understand how spring boot is different or similar from spring 
   - why do we use it?
d. Understand (at an high-level) the different modules in spring
e. Pick one module, please ensure you don't a cross-cutting concern 
   like AOP or Security to begin with, you can deal with these later.
f. Let's say, you pickup Spring MVC - then look for some decent examples on the internet, 
   implement them as is, play around them and build you own (enhanced) version of it.
   Referring the spring official doc should happen in parallel to this.
g. Then refactor that spring version with spring boot. Observe, takes notes.
h. Repeat.


# data
Better still, use a dedicated migration tool, such as Flyway or Liquibase.

# docker
1. run docker app
2. docker-compose up -d

# implements
implements keyword 에 alt(opt) + enter 를 입력하면 IDE가 자동 구현한다.

# spring-boot-admin
admin 환경

# intellij
cmd + enter → 자동완성
`tdd` keymap

# devtools
서버 자동 업데이트
```
